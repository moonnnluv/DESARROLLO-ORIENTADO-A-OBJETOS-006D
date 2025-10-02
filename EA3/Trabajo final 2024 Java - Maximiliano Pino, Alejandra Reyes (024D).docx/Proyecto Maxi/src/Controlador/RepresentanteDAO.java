package controlador;

import modelo.Representante;
import java.sql.*;
import java.util.ArrayList;

public class RepresentanteDAO {

    public String modificarRepresentante(Representante representante) {
        String sql = "UPDATE Representante SET nombre = ?, nacionalidad = ? WHERE rut = ?";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, representante.getNombre());
            stmt.setString(2, representante.getNacionalidad());
            stmt.setString(3, representante.getRut());
            int filasAfectadas = stmt.executeUpdate();
            return filasAfectadas > 0 ? "Representante modificado correctamente." : "No se encontró un representante con el RUT proporcionado.";
        } catch (SQLException | ClassNotFoundException e) {
            return "Error al modificar el representante: " + e.getMessage();
        }
    }

    public Representante buscarPorRut(String rut) {
        String sql = "SELECT * FROM Representante WHERE rut = ?";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, rut);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Representante(
                        rs.getInt("idRepresentante"),
                        rs.getString("rut"),
                        rs.getString("nombre"),
                        rs.getString("nacionalidad")
                );
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error al buscar representante: " + e.getMessage());
        }
        return null;
    }

    public String agregarRepresentante(Representante representante) {
        String sql = "INSERT INTO Representante (rut, nombre, nacionalidad) VALUES (?, ?, ?)";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, representante.getRut());
            stmt.setString(2, representante.getNombre());
            stmt.setString(3, representante.getNacionalidad());
            stmt.executeUpdate();
            return "Representante agregado correctamente.";
        } catch (SQLException | ClassNotFoundException e) {
            return "Error al agregar representante: " + e.getMessage();
        }
    }

    public ArrayList<Representante> listarRepresentantes() {
        ArrayList<Representante> lista = new ArrayList<>();
        String sql = "SELECT * FROM Representante";
        try (Connection conn = Conexion.getConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Representante representante = new Representante(
                        rs.getInt("idRepresentante"),
                        rs.getString("rut"),
                        rs.getString("nombre"),
                        rs.getString("nacionalidad")
                );
                lista.add(representante);
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error al listar representantes: " + e.getMessage());
        }
        return lista;
    }
}
