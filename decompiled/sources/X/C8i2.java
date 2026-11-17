package X;

import android.os.Bundle;
import com.whatsapp.accountlinking.ipc.api.models.LinkedOperation;
import com.whatsapp.accountlinking.ipc.api.models.Operation;
import com.whatsapp.accountlinking.ipc.api.models.UnlinkedOperation;
import com.whatsapp.accountlinking.ipc.api.models.WaAcIpcRequest;
import kotlin.jvm.functions.Function0;

/* renamed from: X.8i2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8i2 implements Ht9, Function0 {
    public final int $t;

    public C8i2(int i) {
        this.$t = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return AnonymousClass002.A0k();
            case 1:
            case 5:
            default:
                return null;
            case 2:
                GBK gbk = AbstractC9266GBt.A00;
                return HlU.A01;
            case 3:
                throw C3cG.A0Q("No default size");
            case 4:
                throw C3cG.A0Q("No default context");
            case 6:
                throw C3cG.A0Q("No default glance id");
            case 7:
                return new Bundle();
            case 8:
                return Long.valueOf(System.nanoTime());
            case 9:
                return LinkedOperation._init_$_anonymous_();
            case 10:
                return Operation._init_$_anonymous_();
            case 11:
                return UnlinkedOperation._init_$_anonymous_();
            case 12:
                return WaAcIpcRequest._childSerializers$_anonymous_();
        }
    }
}
