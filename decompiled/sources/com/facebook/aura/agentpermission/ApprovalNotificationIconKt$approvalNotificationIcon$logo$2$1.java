package com.facebook.aura.agentpermission;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C3cG;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.aura.common.image.AuraBitmapLoader;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.agentpermission.ApprovalNotificationIconKt$approvalNotificationIcon$logo$2$1", f = "ApprovalNotificationIcon.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class ApprovalNotificationIconKt$approvalNotificationIcon$logo$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Bitmap>, Object> {
    public final /* synthetic */ int $sizePx;
    public final /* synthetic */ Uri $uri;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApprovalNotificationIconKt$approvalNotificationIcon$logo$2$1(Uri uri, int i, HtJ<? super ApprovalNotificationIconKt$approvalNotificationIcon$logo$2$1> htJ) {
        super(2, htJ);
        this.$uri = uri;
        this.$sizePx = i;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ApprovalNotificationIconKt$approvalNotificationIcon$logo$2$1(this.$uri, this.$sizePx, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AuraBitmapLoader auraBitmapLoader = AuraBitmapLoader.INSTANCE;
            Uri uri = this.$uri;
            Integer numA0R = C3cG.A0R(this.$sizePx);
            this.label = 1;
            obj = auraBitmapLoader.load(uri, ApprovalNotificationIconKt.CALLER_CONTEXT, numA0R, null, this);
            if (obj == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return obj;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Bitmap> htJ) {
        return ((ApprovalNotificationIconKt$approvalNotificationIcon$logo$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
