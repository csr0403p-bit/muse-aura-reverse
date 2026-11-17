package com.facebook.aura.commands.calllogs;

/* loaded from: classes3.dex */
public abstract class CallLogModelsKt {
    public static final String directionOf(int i) {
        switch (i) {
            case 1:
                return "incoming";
            case 2:
                return "outgoing";
            case 3:
                return "missed";
            case 4:
                return "voicemail";
            case 5:
                return "rejected";
            case 6:
                return "blocked";
            case 7:
                return "answered_externally";
            default:
                return "unknown";
        }
    }
}
