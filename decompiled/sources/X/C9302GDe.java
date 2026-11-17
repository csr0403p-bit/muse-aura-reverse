package X;

import java.util.List;

/* renamed from: X.GDe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9302GDe implements InterfaceC9301GDd {
    @Override // X.InterfaceC9301GDd
    public final <L> List<L> AR2(Object message, long offset) {
        GDM gdm = (GDM) AbstractC9398GHn.A00(message, offset);
        if (((GDE) gdm).A00) {
            return gdm;
        }
        GDM gdmAQz = gdm.AQz(AbstractC7610F5x.A0P(gdm));
        C9399GHo.A05(message, offset, gdmAQz);
        return gdmAQz;
    }
}
