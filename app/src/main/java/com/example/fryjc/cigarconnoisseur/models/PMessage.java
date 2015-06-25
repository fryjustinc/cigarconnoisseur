package com.example.fryjc.cigarconnoisseur.models;

/**
 * Created by fryjc on 6/17/2015.
 */
public class PMessage {
    private String mSenderUID;
    private String mReceiverUID;
    private String mMessage;

    public PMessage(String mSenderUID,String mReceiverUID, String mMessage) {
        this.mReceiverUID=mReceiverUID;
        this.mSenderUID = mSenderUID;
        this.mMessage = mMessage;
    }

    public String getmReceiverUID() {
        return mReceiverUID;
    }

    public void setmReceiverUID(String mReceiverUID) {
        this.mReceiverUID = mReceiverUID;
    }

    public String getmSenderUID() {
        return mSenderUID;
    }

    public void setmSenderUID(String mSenderUID) {
        this.mSenderUID = mSenderUID;
    }

    public String getmMessage() {
        return mMessage;
    }

    public void setmMessage(String mMessage) {
        this.mMessage = mMessage;
    }




}
