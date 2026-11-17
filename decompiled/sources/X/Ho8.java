package X;

import com.facebook.aura.commands.sms.DeviceSmsReaderKt;

/* loaded from: classes6.dex */
public enum Ho8 implements InterfaceC2571Be0<String> {
    ACCOUNT_SWITCH("account_switch"),
    /* JADX INFO: Fake field, exist only in values array */
    ACTIVITY_ONDESTROY("activity_ondestroy"),
    /* JADX INFO: Fake field, exist only in values array */
    COLD_START_SYNC("cold_start_sync"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTROLLER_REINIT("controller_reinit"),
    /* JADX INFO: Fake field, exist only in values array */
    LOGIN_FAILURE("login_failure"),
    LOGOUT("logout"),
    /* JADX INFO: Fake field, exist only in values array */
    ONDESTROY("ondestroy"),
    /* JADX INFO: Fake field, exist only in values array */
    OTHER(DeviceSmsReaderKt.ATTACHMENT_OTHER);

    public final String mValue;

    @Override // X.InterfaceC2571Be0
    public final /* bridge */ /* synthetic */ String getValue() {
        return this.mValue;
    }

    Ho8(String str) {
        this.mValue = str;
    }
}
