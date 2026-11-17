package com.facebook.aura.screenshot;

import X.AMi;
import X.AT3;
import X.AW9;
import X.AWx;
import X.AaJ;
import X.AbstractC1290Aga;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.B6A;
import X.BDh;
import X.C7384Etj;
import X.G0U;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchScreenshotModeKt$HatchScreenshotMode$1$3$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ SnapshotStateList<AWx> $currentPoints;
    public final /* synthetic */ SnapshotStateList<List<AWx>> $paths;
    public final /* synthetic */ Bitmap $screenshotBitmap;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        long jAKb = at3.AKb();
        if (AnonymousClass001.A00(jAKb) <= 0.0f || AnonymousClass001.A01(jAKb, 4294967295L) <= 0.0f) {
            return;
        }
        float width = this.$screenshotBitmap.getWidth();
        float height = this.$screenshotBitmap.getHeight();
        long jAKb2 = at3.AKb();
        float fA00 = AnonymousClass001.A00(jAKb2);
        float fA01 = AnonymousClass001.A01(jAKb2, 4294967295L);
        float fMin = Math.min(fA00 / width, fA01 / height);
        float f = width * fMin;
        float f2 = (fA00 - f) / 2.0f;
        float f3 = height * fMin;
        float f4 = (fA01 - f3) / 2.0f;
        AbstractC1290Aga.A00(AW9.A01(at3)).drawBitmap(this.$screenshotBitmap, (Rect) null, new RectF(f2, f4, f + f2, f3 + f4), (Paint) null);
        AaJ aaJA00 = AaJ.A00(null, 8.0f, 1);
        Iterator it = this.$paths.iterator();
        while (it.hasNext()) {
            HatchScreenshotModeKt.m1891drawPathFromPoints9LQNqLg(at3, (List) it.next(), B6A.A09, aaJA00);
        }
        if (this.$currentPoints.size() >= 2) {
            SnapshotStateList<AWx> snapshotStateList = this.$currentPoints;
            HatchScreenshotModeKt.m1891drawPathFromPoints9LQNqLg(at3, ((AMi) BDh.A07(snapshotStateList, snapshotStateList.A00)).A02, B6A.A09, aaJA00);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchScreenshotModeKt$HatchScreenshotMode$1$3$1(Bitmap bitmap, SnapshotStateList<List<AWx>> snapshotStateList, SnapshotStateList<AWx> snapshotStateList2) {
        super(1);
        this.$screenshotBitmap = bitmap;
        this.$paths = snapshotStateList;
        this.$currentPoints = snapshotStateList2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
