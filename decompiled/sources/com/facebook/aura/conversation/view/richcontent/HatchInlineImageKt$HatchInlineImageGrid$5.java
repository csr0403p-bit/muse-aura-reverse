package com.facebook.aura.conversation.view.richcontent;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.C78N;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2k;
import com.facebook.aura.ui.gestures.ChildPressTrackerKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchInlineImageKt$HatchInlineImageGrid$5 extends AbstractC7559F3s implements G2k<Integer, BRg, Boolean, BFM, Integer, Unit> {
    public final /* synthetic */ List<String> $cellKeys;
    public final /* synthetic */ AHD<HatchInlineImageData> $images;
    public final /* synthetic */ boolean $isLongPressShareTarget;
    public final /* synthetic */ G0V<AHD<HatchInlineImageData>, Integer, Unit> $onImageClick;
    public final /* synthetic */ G0U<String, Unit> $onImageError;
    public final /* synthetic */ String $sharedElementKeyPrefix;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchInlineImageKt$HatchInlineImageGrid$5(AHD<HatchInlineImageData> ahd, G0V<? super AHD<HatchInlineImageData>, ? super Integer, Unit> g0v, boolean z, String str, List<String> list, G0U<? super String, Unit> g0u) {
        super(5);
        this.$images = ahd;
        this.$onImageClick = g0v;
        this.$isLongPressShareTarget = z;
        this.$sharedElementKeyPrefix = str;
        this.$cellKeys = list;
        this.$onImageError = g0u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v2, types: [int] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    public final void invoke(int i, BRg bRg, boolean z, BFM bfm, int i2) {
        Function0 function0;
        int iA1V;
        String str;
        BRg bRgLongPressMediaTarget = bRg;
        C7384Etj.A0Y(bRgLongPressMediaTarget, 1);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, bRgLongPressMediaTarget);
        }
        if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0p(bfm, z);
        }
        if (!AnonymousClass001.A1b(AnonymousClass004.A1L(iA0D), bfm, iA0D)) {
            bfm.Afo();
            return;
        }
        HatchInlineImageData hatchInlineImageData = (HatchInlineImageData) this.$images.get(i);
        String str2 = hatchInlineImageData.url;
        String str3 = hatchInlineImageData.alt;
        int i3 = i + 1;
        int size = this.$images.size();
        G0V<AHD<HatchInlineImageData>, Integer, Unit> g0v = this.$onImageClick;
        if (g0v == null) {
            function0 = null;
            iA1V = AnonymousClass004.A1P(bfm, 883601570);
        } else {
            bfm.AgE(883601571);
            AHD<HatchInlineImageData> ahd = this.$images;
            boolean zA1K = AnonymousClass003.A1K(bfm, g0v, ahd) | AnonymousClass003.A1B(iA0D);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = new HatchInlineImageKt$HatchInlineImageGrid$5$1$1$1(g0v, ahd, i);
                bfm.Ai0(objAaT);
            }
            function0 = (Function0) objAaT;
            iA1V = AnonymousClass001.A1V(bfm);
        }
        if (this.$isLongPressShareTarget && !z && (str = this.$sharedElementKeyPrefix) != null) {
            bRgLongPressMediaTarget = ChildPressTrackerKt.longPressMediaTarget(bRgLongPressMediaTarget, FGI.A0U(str, "_", hatchInlineImageData.url));
        }
        boolean z2 = hatchInlineImageData.deleted;
        String str4 = hatchInlineImageData.workspacePath;
        List<String> list = this.$cellKeys;
        HatchInlineImageKt.GridImageCell(str2, str3, i3, size, function0, bRgLongPressMediaTarget, z2, str4, this.$onImageError, list != null ? list.get(i) : null, bfm, iA1V, iA1V);
    }

    @Override // X.G2k
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, BRg bRg, Boolean bool, BFM bfm, Integer num2) {
        invoke(AnonymousClass001.A0F(num), bRg, AnonymousClass001.A1X(bool), bfm, AnonymousClass001.A0F(num2));
        return Unit.INSTANCE;
    }
}
