package controlador;

import modelo.Empresa;
import java.sql.*;
import java.util.ArrayList;

public class EmpresaDAO {

    public String modificarEmpresa(Empresa empresa) {
        String sql = "UPDATE Empresa SET nombre = ?, giro = ?, comuna = ?, idRepresentante = ? WHERE rut = ?";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, empresa.getNombre());
            stmt.setString(2, empresa.getGiro());
            stmt.setString(3, empresa.getComuna());
            stmt.setInt(4, empresa.getRepresentante().getIdRepresentante());
            stmt.setString(5, empresa.getRut());
            int filasAfectadas = stmt.executeUpdate();
            return filasAfectadas > 0 ? "Empresa modificada correctamente." : "No se encontró una empresa con el RUT proporcionado.";
        } catch (SQLException | ClassNotFoundException e) {
            return "Error al modificar la empresa: " + e.getMessage();
        }
    }

    public String eliminarEmpresa(String rut) {
        String sql = "DELETE FROM Empresa WHERE rut = ?";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, rut);
            int filasAfectadas = stmt.executeUpdate();
            return filasAfectadas > 0 ? "Empresa eliminada correctamente." : "No se encontró una empresa con el RUT proporcionado.";
        } catch (SQLException | ClassNotFoundException e) {
            return "Error al eliminar la empresa: " + e.getMessage();
        }
    }

    public String agregarEmpresa(Empresa empresa) {
        String sql = "INSERT INTO Empresa (rut, nombre, giro, comuna, estado, mes, anio, idRepresentante) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, empresa.getRut());
            stmt.setString(2, empresa.getNombre());
            stmt.setString(3, empresa.getGiro());
            stmt.setString(4, empresa.getComuna());
            stmt.setInt(5, empresa.isEstado() ? 1 : 0);
            stmt.setInt(6, empresa.getMes());
            stmt.setInt(7, empresa.getAño());
            stmt.setInt(8, empresa.getRepresentante().getIdRepresentante());
            stmt.executeUpdate();
            return "Empresa agregada correctamente.";
        } catch (SQLException | ClassNotFoundException e) {
            return "Error al agregar empresa: " + e.getMessage();
        }
    }

    public ArrayList<Empresa> listarEmpresas() {
        ArrayList<Empresa> lista = new ArrayList<>();
        String sql = "SELECT * FROM Empresa";
        try (Connection conn = Conexion.getConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Empresa empresa = new Empresa(
                        rs.getString("rut"),
                        rs.getString("nombre"),
                        rs.getString("giro"),
                        rs.getString("comuna"),
                        rs.getInt("estado") == 1,
                        rs.getInt("mes"),
                        rs.getInt("anio"),
                        null
                );
                lista.add(empresa);
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error al listar empresas: " + e.getMessage());
        }
        return lista;
    }

    public int cantidadEmpresasActivas() {
        String sql = "SELECT COUNT(*) FROM Empresa WHERE estado = 1";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error al contar empresas activas: " + e.getMessage());
        }
        return 0;
    }

    public double promedioInicioActividades() {
        String sql = "SELECT AVG(anio) FROM Empresa";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return rs.getDouble(1);
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error al calcular promedio de inicio de actividades: " + e.getMessage());
        }
        return 0.0;
    }
}
