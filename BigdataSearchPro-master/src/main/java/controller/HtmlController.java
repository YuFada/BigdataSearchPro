package controller;

import org.springframework.stereotype.Controller;

import java.util.ArrayList;

/**
* @author YeChunBo
* @time 2019��4��1�� 
*
* ��˵�� 
*/

import javax.servlet.http.HttpServletRequest;  

import org.springframework.web.bind.annotation.*;

import serviceImpl.ElasticServiceImpl;    
    
@Controller  
public class HtmlController {    
     
    @GetMapping("/indexView")  
    String test(HttpServletRequest request) { 
    	ElasticServiceImpl elsService = new ElasticServiceImpl();
		ArrayList<String> indexList = elsService.getAllIndex();
		indexList.add("all index");
        //�߼�����  
        request.setAttribute("indexList", indexList);  
        return "indexView";  // ��templates ��html��һ��
    }    
    
}    


