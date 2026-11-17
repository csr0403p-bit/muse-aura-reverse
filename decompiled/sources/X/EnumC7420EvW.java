package X;

import com.facebook.aura.commands.sms.DeviceSmsReaderKt;

/* renamed from: X.EvW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC7420EvW implements InterfaceC2571Be0<String> {
    COLD_PROVISION("cold_provision"),
    HARD_REPLACEMENT("hard_replacement"),
    /* JADX INFO: Fake field, exist only in values array */
    OTHER(DeviceSmsReaderKt.ATTACHMENT_OTHER);

    public final String mValue;

    @Override // X.InterfaceC2571Be0
    public final /* bridge */ /* synthetic */ String getValue() {
        return this.mValue;
    }

    EnumC7420EvW(String str) {
        this.mValue = str;
    }
}
