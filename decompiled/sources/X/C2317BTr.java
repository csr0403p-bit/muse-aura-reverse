package X;

import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import androidx.compose.ui.text.font.AsyncFontListLoader;
import androidx.glance.appwidget.GlanceAppWidgetReceiver;

/* renamed from: X.BTr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2317BTr extends HzP {
    public final int $t;
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2317BTr(Object obj, BringIntoViewRequesterImpl bringIntoViewRequesterImpl, HtJ<? super C2317BTr> htJ) {
        super(bringIntoViewRequesterImpl);
        this.$t = htJ;
        this.A06 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        this.A05 = obj;
        this.A02 |= Integer.MIN_VALUE;
        switch (i) {
            case 0:
                return ((BringIntoViewRequesterImpl) this.A06).A5L(null, this);
            case 1:
                return ((AsyncFontListLoader) this.A06).A01(this);
            default:
                return ((GlanceAppWidgetReceiver) this.A06).doDelete$glance_appwidget(null, null, null, this);
        }
    }
}
