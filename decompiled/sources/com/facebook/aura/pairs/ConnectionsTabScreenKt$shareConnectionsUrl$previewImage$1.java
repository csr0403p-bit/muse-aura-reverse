package com.facebook.aura.pairs;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.net.Uri;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsTabScreenKt$shareConnectionsUrl$previewImage$1", f = "ConnectionsTabScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class ConnectionsTabScreenKt$shareConnectionsUrl$previewImage$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Uri>, Object> {
    public final /* synthetic */ Context $context;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionsTabScreenKt$shareConnectionsUrl$previewImage$1(Context context, HtJ<? super ConnectionsTabScreenKt$shareConnectionsUrl$previewImage$1> htJ) {
        super(2, htJ);
        this.$context = context;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConnectionsTabScreenKt$shareConnectionsUrl$previewImage$1(this.$context, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Uri> htJ) {
        return new ConnectionsTabScreenKt$shareConnectionsUrl$previewImage$1(this.$context, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return PairsSharePreview.INSTANCE.imageUri(this.$context);
    }
}
