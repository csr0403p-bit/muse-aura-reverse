package com.facebook.aura.widgets;

import X.Ab3;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C16n;
import X.C60Q;
import X.G0V;
import X.HtJ;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.glance.appwidget.GlanceAppWidget;
import com.facebook.aura.analytics.hatch.HatchWidgetKind;
import com.facebook.aura.identity.provider.HatchChatThemeHelperKt;
import java.io.File;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class AvatarHomeScreenWidget extends AgentWidget {
    public static final int $stable = 0;
    public static final AvatarHomeScreenWidget INSTANCE = new AvatarHomeScreenWidget();
    public static final HatchWidgetKind kind = HatchWidgetKind.AVATAR;
    public static final long previewSize = C16n.A00(180.0f, 180.0f);
    public static final Class<AvatarWidgetReceiver> receiver = AvatarWidgetReceiver.class;

    /* renamed from: com.facebook.aura.widgets.AvatarHomeScreenWidget$Preview$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i) {
            super(2);
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AvatarHomeScreenWidget.this.Preview(bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public AvatarHomeScreenWidget() {
        super(HatchChatThemeHelperKt.HATCH_AVATAR_THEME_ID, "avatar_widgets");
    }

    @Override // com.facebook.aura.widgets.AgentWidget
    public Object decodeAvatar(Context context, File file, HtJ<? super Bitmap> htJ) {
        return WidgetImagesKt.decodeWidgetBitmap(file, Ab3.A01(180.0f * C60Q.A0B(context).density), htJ);
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public HatchWidgetKind getKind() {
        return kind;
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    /* renamed from: getPreviewSize-MYxV2XQ */
    public long mo3155getPreviewSizeMYxV2XQ() {
        return previewSize;
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public Class<AvatarWidgetReceiver> getReceiver() {
        return receiver;
    }

    @Override // com.facebook.aura.widgets.AgentWidget
    public GlanceAppWidget newGlanceWidget() {
        return new AvatarWidget();
    }

    @Override // com.facebook.aura.widgets.HomeScreenWidget
    public void Preview(BFM bfm, int i) {
        bfm.AgG(-377526959);
        int i2 = i & 1;
        if (bfm.AfS(i2, AnonymousClass002.A1L(i2))) {
            AvatarWidgetKt.AvatarPreview(null, bfm, 0, 1);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(i);
        }
    }
}
