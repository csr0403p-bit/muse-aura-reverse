package X;

import com.facebook.aura.commands.sms.DeviceSmsReaderKt;

/* renamed from: X.Eua, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC7397Eua implements InterfaceC2571Be0<String> {
    ANDROID("android"),
    /* JADX INFO: Fake field, exist only in values array */
    BLOKS_ANDROID("bloks_android"),
    /* JADX INFO: Fake field, exist only in values array */
    BLOKS_IOS("bloks_ios"),
    /* JADX INFO: Fake field, exist only in values array */
    COMET("comet"),
    /* JADX INFO: Fake field, exist only in values array */
    IOS("ios"),
    /* JADX INFO: Fake field, exist only in values array */
    MSITE("msite"),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_TEMPLATE("native_template"),
    /* JADX INFO: Fake field, exist only in values array */
    OC("OC"),
    /* JADX INFO: Fake field, exist only in values array */
    REACT_NATIVE_ANDROID("react_native_android"),
    /* JADX INFO: Fake field, exist only in values array */
    REACT_NATIVE_IOS("react_native_ios"),
    /* JADX INFO: Fake field, exist only in values array */
    WEB("web"),
    /* JADX INFO: Fake field, exist only in values array */
    FBCODE("fbcode"),
    /* JADX INFO: Fake field, exist only in values array */
    DERIVED("derived"),
    /* JADX INFO: Fake field, exist only in values array */
    UNITY("unity"),
    /* JADX INFO: Fake field, exist only in values array */
    OTHER(DeviceSmsReaderKt.ATTACHMENT_OTHER);

    public final String mValue;

    @Override // X.InterfaceC2571Be0
    public final /* bridge */ /* synthetic */ String getValue() {
        return this.mValue;
    }

    EnumC7397Eua(String str) {
        this.mValue = str;
    }
}
