package com.grepp.lang;

import com.grepp.lang.vo.Lang;
import com.grepp.lang.vo.LangFormat;
import com.grepp.llm.GeminiChatModel;
import com.grepp.llm.TextRequest;
import com.grepp.llm.gemini.text.ChatModel;
import com.grepp.llm.gemini.text.Response;
import java.util.List;

public class Run {

    public static void main(String[] args) {
        String msg = "백엔드 개발자가 공부해야 하는 프로그래밍 언어 추천해줘";

        ChatModel model = new GeminiChatModel("1.5",
            "AIzaSyAxGitJ3cnSa38e16yLOmOc_Jfj8stshIA");

        Response response = model.invoke(new TextRequest<>(msg, LangFormat.format));
        List<Lang> langs = response.response().stream().map(e -> LangFormat.toVo(e)).toList();
        System.out.println(langs);
    }

}
