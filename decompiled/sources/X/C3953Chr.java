package X;

import com.facebook.aura.notifications.push.AuraPushTokenSender;
import com.facebook.quicklog.MarkerEditor;
import kotlin.Unit;

/* renamed from: X.Chr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3953Chr extends AbstractC7559F3s implements G0U<MarkerEditor, Unit> {
    public final /* synthetic */ boolean $success;
    public final /* synthetic */ InterfaceC3957Chw $tokenSender;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3953Chr(InterfaceC3957Chw interfaceC3957Chw, boolean z) {
        super(1);
        this.$tokenSender = interfaceC3957Chw;
        this.$success = z;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(MarkerEditor markerEditor) {
        MarkerEditor markerEditorA01 = AbstractC7559F3s.A01(markerEditor);
        markerEditorA01.point(FGI.A0M(((AuraPushTokenSender) this.$tokenSender).pushTokenSenderName, ".register_token_end"));
        markerEditorA01.annotate("success", this.$success);
        return Unit.INSTANCE;
    }
}
