package X;

import android.media.MediaFormat;
import android.view.Surface;

/* renamed from: X.Dxo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6204Dxo implements InterfaceC6224DyF {
    public static final C6204Dxo A00 = new C6204Dxo();

    @Override // X.InterfaceC6224DyF
    public final InterfaceC6181DxP A2w(AbstractC6211Dxx abstractC6211Dxx, C6175DxI c6175DxI, Integer num, String str, boolean z) {
        return (c6175DxI.A0T ? C6152Dwu.A0A : DxJ.A0B).A2w(abstractC6211Dxx, c6175DxI, num, str, z);
    }

    @Override // X.InterfaceC6224DyF
    public final InterfaceC6181DxP A2x(MediaFormat mediaFormat, Surface surface, AbstractC6211Dxx abstractC6211Dxx, C6175DxI c6175DxI, Integer num, String str, boolean z) {
        return (c6175DxI.A0T ? C6152Dwu.A0A : DxJ.A0B).A2x(mediaFormat, surface, abstractC6211Dxx, c6175DxI, num, str, z);
    }

    @Override // X.InterfaceC6224DyF
    public final void AaD(AbstractC6211Dxx abstractC6211Dxx, C6175DxI c6175DxI, Integer num, String str, InterfaceC6181DxP interfaceC6181DxP, boolean z) {
        (c6175DxI.A0T ? C6152Dwu.A0A : DxJ.A0B).AaD(abstractC6211Dxx, c6175DxI, num, str, interfaceC6181DxP, z);
    }
}
