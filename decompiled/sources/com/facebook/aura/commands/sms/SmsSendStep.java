package com.facebook.aura.commands.sms;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class SmsSendStep {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SmsSendStep[] $VALUES;
    public static final SmsSendStep CLEANUP;
    public static final SmsSendStep CREATE_SENT_INTENTS;
    public static final SmsSendStep DIVIDE_MESSAGE;
    public static final SmsSendStep GET_SMS_MANAGER;
    public static final SmsSendStep REGISTER_RECEIVER;
    public static final SmsSendStep SEND;
    public final String wireValue;

    static {
        SmsSendStep smsSendStep = new SmsSendStep("GET_SMS_MANAGER", 0, "get_sms_manager");
        GET_SMS_MANAGER = smsSendStep;
        SmsSendStep smsSendStep2 = new SmsSendStep("DIVIDE_MESSAGE", 1, "divide_message");
        DIVIDE_MESSAGE = smsSendStep2;
        SmsSendStep smsSendStep3 = new SmsSendStep("REGISTER_RECEIVER", 2, "register_receiver");
        REGISTER_RECEIVER = smsSendStep3;
        SmsSendStep smsSendStep4 = new SmsSendStep("CREATE_SENT_INTENTS", 3, "create_sent_intents");
        CREATE_SENT_INTENTS = smsSendStep4;
        SmsSendStep smsSendStep5 = new SmsSendStep("SEND", 4, "send");
        SEND = smsSendStep5;
        SmsSendStep smsSendStep6 = new SmsSendStep("CLEANUP", 5, "cleanup");
        CLEANUP = smsSendStep6;
        SmsSendStep[] smsSendStepArr = {smsSendStep, smsSendStep2, smsSendStep3, smsSendStep4, smsSendStep5, smsSendStep6};
        $VALUES = smsSendStepArr;
        $ENTRIES = C3cG.A0w(smsSendStepArr);
    }

    public static Ey9<SmsSendStep> getEntries() {
        return $ENTRIES;
    }

    public static SmsSendStep valueOf(String str) {
        return (SmsSendStep) Enum.valueOf(SmsSendStep.class, str);
    }

    public static SmsSendStep[] values() {
        return (SmsSendStep[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public SmsSendStep(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
