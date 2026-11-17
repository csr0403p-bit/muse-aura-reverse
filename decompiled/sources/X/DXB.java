package X;

import com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2InitHelper;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class DXB implements InterfaceC5318DgC {
    public final /* synthetic */ InterfaceC5860Dqu A00;
    public final /* synthetic */ HeroExoPlayer2InitHelper A01;
    public final /* synthetic */ boolean A02;

    public DXB(InterfaceC5860Dqu interfaceC5860Dqu, HeroExoPlayer2InitHelper heroExoPlayer2InitHelper, boolean z) {
        this.A02 = z;
        this.A00 = interfaceC5860Dqu;
        this.A01 = heroExoPlayer2InitHelper;
    }

    @Override // X.InterfaceC5318DgC
    public final void onCues(List<E0J> list) {
        if (this.A02) {
            return;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        if (list != null) {
            Iterator<E0J> it = list.iterator();
            while (it.hasNext()) {
                CharSequence charSequence = it.next().A0G;
                DXC dxc = new DXC();
                dxc.A00 = charSequence;
                arrayListA0h.add(dxc);
            }
        }
        ((Dlw) this.A00).A2A.onCues(arrayListA0h);
    }

    @Override // X.InterfaceC5318DgC
    public final void onCues(DXD dxd) {
        ArrayList arrayListA0h = C3cG.A0h();
        ImmutableList<E0J> immutableList = dxd.A00;
        if (immutableList != null) {
            AbstractC7489Ext<E0J> it = immutableList.iterator();
            while (it.hasNext()) {
                CharSequence charSequence = it.next().A0G;
                DXC dxc = new DXC();
                dxc.A00 = charSequence;
                arrayListA0h.add(dxc);
            }
        }
        ((Dlw) this.A00).A2A.onCues(arrayListA0h);
    }
}
