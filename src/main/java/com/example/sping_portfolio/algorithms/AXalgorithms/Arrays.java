package com.example.sping_portfolio.algorithms.AXalgorithms;

public class Arrays {
    public String toHTML(String[][] data){
        StringBuilder sb = new StringBuilder();
        sb.append("<table>\n");
        for(int row = 0; row < data.length; row++){
            sb.append("\t<tr>\n");
            for(int col = 0; col < data[0].length; col++){
                sb.append("\t\t<td>" + data[row][col] + "</td>\n");
            }
            sb.append("\t</tr>\n");
        }
        sb.append("</table>");
        return sb.toString();
    }
}
