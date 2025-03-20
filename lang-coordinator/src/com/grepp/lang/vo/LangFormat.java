package com.grepp.lang.vo;

import com.grepp.llm.gemini.text.vo.generation.PropertyType;
import java.util.Map;

public record LangFormat(
    PropertyType name,
    PropertyType difficultylevel,
    PropertyType reason
) {

    public static final LangFormat format
        = new LangFormat(
            PropertyType.STRING,
            PropertyType.STRING,
            PropertyType.STRING);

    public static Lang toVo(Map<String, Object> data){
        return new Lang(
            (String) data.get("name"),
            (String) data.get("difficultyLevel"),
            (String) data.get("reason")
        )
    }

}
