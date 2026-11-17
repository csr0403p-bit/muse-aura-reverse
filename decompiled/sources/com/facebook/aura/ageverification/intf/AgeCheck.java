package com.facebook.aura.ageverification.intf;

import X.AnonymousClass005;
import X.C06H;
import X.C0881AGi;
import X.C3cH;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public final class AgeCheck {
    public long attemptStartedAtMs;
    public int attempts;
    public final long enteredAtMs;
    public final String entryContext;
    public final String entryTrigger;
    public final String id;
    public String introStep;
    public String lastMethod;
    public List<String> methodsTried;
    public String openMethod;
    public String previousStep;
    public String selectedMethod;
    public int seq;
    public String step;

    public final void setMethodsTried(List<String> list) {
        C7384Etj.A0Y(list, 0);
        this.methodsTried = list;
    }

    public final long getAttemptStartedAtMs() {
        return this.attemptStartedAtMs;
    }

    public final int getAttempts() {
        return this.attempts;
    }

    public final long getEnteredAtMs() {
        return this.enteredAtMs;
    }

    public final String getEntryContext() {
        return this.entryContext;
    }

    public final String getEntryTrigger() {
        return this.entryTrigger;
    }

    public final String getId() {
        return this.id;
    }

    public final String getIntroStep() {
        return this.introStep;
    }

    public final String getLastMethod() {
        return this.lastMethod;
    }

    public final List<String> getMethodsTried() {
        return this.methodsTried;
    }

    public final String getOpenMethod() {
        return this.openMethod;
    }

    public final String getPreviousStep() {
        return this.previousStep;
    }

    public final String getSelectedMethod() {
        return this.selectedMethod;
    }

    public final int getSeq() {
        return this.seq;
    }

    public final String getStep() {
        return this.step;
    }

    public final void setAttemptStartedAtMs(long j) {
        this.attemptStartedAtMs = j;
    }

    public final void setAttempts(int i) {
        this.attempts = i;
    }

    public final void setIntroStep(String str) {
        this.introStep = str;
    }

    public final void setLastMethod(String str) {
        this.lastMethod = str;
    }

    public final void setOpenMethod(String str) {
        this.openMethod = str;
    }

    public final void setPreviousStep(String str) {
        this.previousStep = str;
    }

    public final void setSelectedMethod(String str) {
        this.selectedMethod = str;
    }

    public final void setSeq(int i) {
        this.seq = i;
    }

    public final void setStep(String str) {
        this.step = str;
    }

    public AgeCheck(String str, String str2, String str3, long j, int i, int i2, String str4, long j2, String str5, String str6, String str7, String str8, String str9, List<String> list) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(list, 13);
        this.id = str;
        this.entryContext = str2;
        this.entryTrigger = str3;
        this.enteredAtMs = j;
        this.seq = i;
        this.attempts = i2;
        this.openMethod = str4;
        this.attemptStartedAtMs = j2;
        this.step = str5;
        this.previousStep = str6;
        this.introStep = str7;
        this.selectedMethod = str8;
        this.lastMethod = str9;
        this.methodsTried = list;
    }

    public /* synthetic */ AgeCheck(String str, String str2, String str3, long j, int i, int i2, String str4, long j2, String str5, String str6, String str7, String str8, String str9, List list, int i3, C06H c06h) {
        this(str, str2, str3, j, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? null : str4, C3cH.A03(i3 & 128, j2), (i3 & 256) != 0 ? null : str5, (i3 & 512) != 0 ? null : str6, (i3 & 1024) != 0 ? null : str7, (i3 & 2048) != 0 ? null : str8, (i3 & 4096) != 0 ? null : str9, (i3 & 8192) != 0 ? C0881AGi.A00 : list);
    }
}
