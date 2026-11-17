package X;

import android.content.Intent;
import android.content.res.Resources;
import androidx.wear.remote.interactions.RemoteActivityHelper$RemoteIntentResultReceiver;
import kotlin.Unit;

/* renamed from: X.CwB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4444CwB extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ InterfaceC4453CwV $callback;
    public final /* synthetic */ C3010Brs<Void> $completer;
    public final /* synthetic */ Intent $intent;
    public final /* synthetic */ String $nodeId;
    public final /* synthetic */ C4443CwA this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/CwV;Ljava/lang/String;LX/CwA;Landroid/content/Intent;LX/Brs<Ljava/lang/Void;>;)V */
    public C4444CwB(Intent intent, C3010Brs c3010Brs, InterfaceC4453CwV interfaceC4453CwV, C4443CwA c4443CwA, String str) {
        super(1);
        this.$callback = interfaceC4453CwV;
        this.$nodeId = str;
        this.this$0 = c4443CwA;
        this.$intent = intent;
        this.$completer = c3010Brs;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(String str) {
        String str2 = str;
        if (str2 == null) {
            str2 = "com.google.android.wearable.app";
        }
        int length = str2.length();
        InterfaceC4453CwV interfaceC4453CwV = this.$callback;
        if (length == 0) {
            ((C4445CwC) interfaceC4453CwV).A00.A04(new Resources.NotFoundException(FGI.A0U("Device ", this.$nodeId, " is not connected")));
        } else {
            ((C4445CwC) interfaceC4453CwV).A01.A02.sendBroadcast(C4443CwA.A00(this.$intent, new RemoteActivityHelper$RemoteIntentResultReceiver(this.$completer, 1), this.$nodeId, str2));
        }
        return Unit.INSTANCE;
    }
}
