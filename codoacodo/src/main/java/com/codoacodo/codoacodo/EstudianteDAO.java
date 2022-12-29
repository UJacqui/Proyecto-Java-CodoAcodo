package com.codoacodo.codoacodo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class EstudianteDAO {
    public EstudianteDAO(int id_persona, String nombre, String apellido, int edad) {
    }

    //  metodos del crud
    public EstudianteDAO obtenerPorIdPersona(int id) {
        String sql = "SELECT * FROM Estudiantes1 WHERE ID_PERSONA="+id;

        //Connection
        Connection con = AdministradorDeConexiones.getConnection();

        EstudianteDAO estudianteFromDb = null;

        //Statement
        try {
            Statement st = con.createStatement();

            //resultset
            ResultSet rs = st.executeQuery(sql);

            //VIENE UN SOLO REGISTRO!!!

            if(rs.next()) {//si existe, hay uno solo
                // rs > sacando los datos
                int id_Persona = rs.getInt(1);//tomar la primer columna
                String nombre = rs.getString(2);
                String apellido=rs.getString(3);
                int edad=rs.getInt(4);



                //campos crear un objeto????
                estudianteFromDb = new EstudianteDAO(id_Persona,nombre,apellido,edad);
            }
        } catch (SQLException e) {
            // ERRORES
            e.printStackTrace();
        }
        return estudianteFromDb;
    }


    //metodos del crud/
    public List<EstudianteDAO> listarEstudiante() {
        String sql = "SELECT * FROM Estudiante ";

        //Connection
        Connection con = AdministradorDeConexiones.getConnection();

        List<EstudianteDAO> list = new ArrayList<>();

        //Statement
        try {
            Statement st = con.createStatement();

            //resultset
            ResultSet rs = st.executeQuery(sql);

            //VIENE UN SOLO REGISTRO!!!

            while(rs.next()) {//
                // rs > sacando los datos
                int id_Persona = rs.getInt(1);//tomar la primer columna
                String nombre = rs.getString(2);
                String apellido= rs.getString(3);
                int edad=rs.getInt(4);

                //campos crear un objeto????
                EstudianteDAO estudianteFromDb = new EstudianteDAO(id_Persona,nombre,apellido,edad);

                //agrego a la lista
                list.add(estudianteFromDb);
            }

            //cierro la conexion
            con.close();
        } catch (SQLException e) {
            // ERRORES
            e.printStackTrace();
        }
        return list;
    }

    //crear un producto en la db/
    public void crearProducto(String nombre, Float precio, String imagen, String codigo) {

        Connection con = AdministradorDeConexiones.getConnection();

        if(con != null) {
            // insert en la db > SQL: INSERT INTO....
            String sql = "INSERT INTO Estudiante (id_persona, nombre,apellido,edad) ";
            sql += "VALUES(1, 'Jacqui', 'Uran', 25)";

            //control de errores
            try {
                Statement st = con.createStatement();
                st.execute(sql);

                //cierre de conexion
                con.close();

            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}