package X;

import com.whatsapp.accountlinking.ipc.api.models.TriggerSilentUnpauseOperation$Trigger$Companion;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* renamed from: X.9ki, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9ki {
    public static final F0C<C9hr<Object>> A00;
    public static final /* synthetic */ Ey9 A01;
    public static final /* synthetic */ C9ki[] A02;
    public static final C9ki A03;
    public static final TriggerSilentUnpauseOperation$Trigger$Companion Companion;

    static {
        C9ki c9ki = new C9ki("BLOCKING", 0);
        A03 = c9ki;
        C9ki[] c9kiArr = {c9ki, new C9ki("NON_BLOCKING", 1)};
        A02 = c9kiArr;
        A01 = C3cG.A0w(c9kiArr);
        Companion = new TriggerSilentUnpauseOperation$Trigger$Companion();
        A00 = C2277BSd.A00(C79.A01, 5);
    }

    public static C9ki valueOf(String str) {
        return (C9ki) Enum.valueOf(C9ki.class, str);
    }

    public static C9ki[] values() {
        return (C9ki[]) A02.clone();
    }

    public C9ki(String str, int i) {
    }
}
