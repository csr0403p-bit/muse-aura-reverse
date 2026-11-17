package X;

import kotlin.Unit;

/* renamed from: X.GXe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9643GXe extends AbstractC7559F3s implements G0U<Throwable, Unit> {
    public final /* synthetic */ C9641GXc $listener;
    public final /* synthetic */ GXD this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9643GXe(C9641GXc c9641GXc, GXD gxd) {
        super(1);
        this.this$0 = gxd;
        this.$listener = c9641GXc;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        try {
            ((GX4) this.this$0).A04.removeOnCommunicationDeviceChangedListener(this.$listener);
        } catch (IllegalArgumentException unused) {
            ((GX4) this.this$0).A09.AiN("RtcAudioOutputManagerImplV2", "selectDevice: tried to remove listener before it was added", BV4.A1W());
        }
        return Unit.INSTANCE;
    }
}
