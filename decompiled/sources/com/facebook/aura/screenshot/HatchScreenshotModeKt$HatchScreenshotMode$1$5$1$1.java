package com.facebook.aura.screenshot;

import X.AWA;
import X.AWx;
import X.AbstractC7559F3s;
import X.G0U;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchScreenshotModeKt$HatchScreenshotMode$1$5$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<AWA> $canvasSize$delegate;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ G0U<String, Unit> $onImageSaved;
    public final /* synthetic */ SnapshotStateList<List<AWx>> $paths;
    public final /* synthetic */ Bitmap $screenshotBitmap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchScreenshotModeKt$HatchScreenshotMode$1$5$1$1(Context context, Bitmap bitmap, SnapshotStateList<List<AWx>> snapshotStateList, G0U<? super String, Unit> g0u, MutableState<AWA> mutableState) {
        super(0);
        this.$context = context;
        this.$screenshotBitmap = bitmap;
        this.$paths = snapshotStateList;
        this.$onImageSaved = g0u;
        this.$canvasSize$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() throws IOException {
        HatchScreenshotModeKt.m1892saveScreenshotAnnotationyzxVdVo(this.$context, this.$screenshotBitmap, this.$paths, AWA.A03(this.$canvasSize$delegate), this.$onImageSaved);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() throws IOException {
        invoke2();
        return Unit.INSTANCE;
    }
}
