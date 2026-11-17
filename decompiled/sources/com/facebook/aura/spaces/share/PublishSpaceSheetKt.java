package com.facebook.aura.spaces.share;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.navigation.key.PublishSpaceSheetKey;
import com.facebook.aura.utils.HatchUtil;
import kotlin.Unit;

/* loaded from: classes3.dex */
public abstract class PublishSpaceSheetKt {

    /* renamed from: com.facebook.aura.spaces.share.PublishSpaceSheetKt$PublishSpaceSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ PublishSpaceSheetKey $navKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PublishSpaceSheetKey publishSpaceSheetKey, int i) {
            super(2);
            this.$navKey = publishSpaceSheetKey;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            PublishSpaceSheetKt.PublishSpaceSheet(this.$navKey, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void PublishSpaceSheet(PublishSpaceSheetKey publishSpaceSheetKey, BFM bfm, int i) {
        C7384Etj.A0Y(publishSpaceSheetKey, 0);
        bfm.AgG(1293649831);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, publishSpaceSheetKey) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0T), bfm, iA0T)) {
            if (HatchUtil.INSTANCE.isConnectionsTabEnabled()) {
                bfm.AgE(380669654);
                SpaceShareLinkSheetKt.SpaceShareLinkSheet(publishSpaceSheetKey, null, bfm, iA0T & 14, 2);
            } else {
                bfm.AgE(380712403);
                HatchPublishSpaceSheetKt.HatchPublishSpaceSheet(publishSpaceSheetKey, bfm, iA0T & 14);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(publishSpaceSheetKey, i);
        }
    }
}
