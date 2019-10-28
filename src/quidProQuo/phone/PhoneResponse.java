package quidProQuo.phone;

import quidProQuo.Response;

import java.awt.image.BufferedImage;

public class PhoneResponse implements Response {

    private String response, caller;
    private int reVal, imVal, popVal, proVal, conVal;
    private BufferedImage avatar;

    public PhoneResponse(String response, int reVal, int imVal, int popVal, int proVal, int conVal, BufferedImage avatar, String caller) {
        this.response = response;
        this.reVal = reVal;
        this.imVal = imVal;
        this.popVal = popVal;
        this.proVal = proVal;
        this.conVal = conVal;
        this.avatar = avatar;
        this.caller = caller;
    }


    @Override
    public char[] getResponseToPrint() {
        return response.toCharArray();
    }

    @Override
    public int getImVal() {
        return imVal;
    }

    @Override
    public int getPopVal() {
        return popVal;
    }

    @Override
    public int getProVal() {
        return proVal;
    }

    @Override
    public int getConVal() {
        return conVal;
    }

    @Override
    public int getReVal() {
        return reVal;
    }


    public BufferedImage getAvatar() { return avatar;}

    public String getCaller(){ return caller; }
}