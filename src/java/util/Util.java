package util;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentMap;
import modelo.Hospedagem;
import modelo.Voo;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 *
 * @author alexandre
 */
public class Util {
    
    /**
     * Retorna um objeto JSON com os valores passados em list.
     * @param list
     * @return 
     */
    public static JSONObject toJSONVoos(ArrayList<Voo> list) {
        JSONArray jsonArray = new JSONArray();
        JSONObject json = new JSONObject();
        list.stream().forEach(jsonArray::add);
        json.put("voos", jsonArray);
        json.put("size", jsonArray.size());
        
        return json;
    }
    
    /**
     * Retorna um objeto JSON com os valores passados em list.
     * @param list
     * @return 
     */
    public static JSONObject toJSONHospedagens(ArrayList<Hospedagem> list) {
        JSONArray jsonArray = new JSONArray();
        JSONObject json = new JSONObject();
        list.stream().forEach(jsonArray::add);
        json.put("hospedagens", jsonArray);
        json.put("size", jsonArray.size());
        
        return json;
    }
    
    /**
     * Iniciar lista de hospedagens com alguns valores.
     * @param hosp 
     */
    public static void iniciarHospedagens(ConcurrentMap<String, Hospedagem> hosp) {
        Hospedagem h = new Hospedagem();
        h.setDestino("saopaulo");
        h.adicionarQuartosPorData(10, "2016-06-08");
        h.adicionarQuartosPorData(10, "2016-06-09");
        h.adicionarQuartosPorData(10, "2016-06-10");
        hosp.put(h.getId(), h);
        
        h = new Hospedagem();
        h.setDestino("catarina");
        h.adicionarQuartosPorData(20, "2016-06-08");
        h.adicionarQuartosPorData(20, "2016-06-09");
        h.adicionarQuartosPorData(20, "2016-06-10");
        hosp.put(h.getId(), h);
    }
    
    /**
     * Iniciar lista de voos com alguns valores.
     * @param voos 
     */
    public static void iniciarVoos(ConcurrentMap<String, Voo> voos) {
        Voo v = new Voo();
        v.setOrigem("curitiba");
        v.setDestino("saopaulo");
        v.setData("2016-06-08");
        voos.put(v.getId(), v);
        
        v = new Voo();
        v.setOrigem("saopaulo");
        v.setDestino("curitiba");
        v.setData("2016-06-08");
        voos.put(v.getId(), v);
        
        v = new Voo();
        v.setOrigem("saopaulo");
        v.setDestino("curitiba");
        v.setData("2016-06-09");
        voos.put(v.getId(), v);
        
        v = new Voo();
        v.setOrigem("saopaulo");
        v.setDestino("curitiba");
        v.setData("2016-06-10");
        voos.put(v.getId(), v);
    }
}
