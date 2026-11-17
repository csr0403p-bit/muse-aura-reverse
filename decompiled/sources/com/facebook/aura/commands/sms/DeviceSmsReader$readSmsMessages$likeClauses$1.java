package com.facebook.aura.commands.sms;

import X.AbstractC7559F3s;
import X.G0U;

/* loaded from: classes3.dex */
public final class DeviceSmsReader$readSmsMessages$likeClauses$1 extends AbstractC7559F3s implements G0U<String, CharSequence> {
    public static final DeviceSmsReader$readSmsMessages$likeClauses$1 INSTANCE = new DeviceSmsReader$readSmsMessages$likeClauses$1();

    public DeviceSmsReader$readSmsMessages$likeClauses$1() {
        super(1);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final CharSequence invoke2(String str) {
        return "address LIKE ?";
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ CharSequence invoke(String str) {
        return "address LIKE ?";
    }
}
