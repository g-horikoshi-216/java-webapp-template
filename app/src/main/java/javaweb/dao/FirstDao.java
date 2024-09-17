// package javaweb.dao;

// import java.sql.*;

// public class FirstDao {
//     public String getMessageById(int id) throws SQLException {
//         String message = null;

//         // データベース接続とクエリの実行
//         try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
//              PreparedStatement pstmt = conn.prepareStatement("SELECT content FROM messages WHERE id = ?")) {

//             pstmt.setInt(1, id);

//             try (ResultSet rs = pstmt.executeQuery()) {
//                 if (rs.next()) {
//                     message = rs.getString("content");
//                 } else {
//                     message = "メッセージが見つかりません。";
//                 }
//             }
//         }

//         return message;
//     }
// }
