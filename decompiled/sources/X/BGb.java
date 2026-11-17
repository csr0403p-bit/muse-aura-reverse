package X;

import com.facebook.aura.json.ClockCardWireActionsKt;

/* loaded from: classes4.dex */
public enum BGb implements InterfaceC2571Be0<String> {
    CLICK("click"),
    DISMISS(ClockCardWireActionsKt.CLOCK_ACTION_DISMISS),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR("error"),
    IMPRESSION("impression"),
    /* JADX INFO: Fake field, exist only in values array */
    INTERMEDIARY_CLICK("intermediary_click"),
    /* JADX INFO: Fake field, exist only in values array */
    INTERMEDIARY_IMPRESSION("intermediary_impression"),
    /* JADX INFO: Fake field, exist only in values array */
    SUPPLEMENTARY_CLICK("supplementary_click"),
    /* JADX INFO: Fake field, exist only in values array */
    SUPPLEMENTARY_IMPRESSION("supplementary_impression");

    public final String mValue;

    @Override // X.InterfaceC2571Be0
    public final /* bridge */ /* synthetic */ String getValue() {
        return this.mValue;
    }

    BGb(String str) {
        this.mValue = str;
    }
}
