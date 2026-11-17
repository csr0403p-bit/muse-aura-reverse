package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.EnumC10460Hji;
import X.G0U;
import X.HtJ;
import X.Hwg;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

@DebugMetadata(c = "com.facebook.aura.file.view.HatchMediaDeletionManager$deleteMedia$1$result$1", f = "HatchMediaDeletionManager.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchMediaDeletionManager$deleteMedia$1$result$1 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
    public final /* synthetic */ boolean $recursive;
    public final /* synthetic */ String $relativePath;
    public int label;
    public final /* synthetic */ HatchMediaDeletionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMediaDeletionManager$deleteMedia$1$result$1(HatchMediaDeletionManager hatchMediaDeletionManager, String str, boolean z, HtJ<? super HatchMediaDeletionManager$deleteMedia$1$result$1> htJ) {
        super(1, htJ);
        this.this$0 = hatchMediaDeletionManager;
        this.$relativePath = str;
        this.$recursive = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        return new HatchMediaDeletionManager$deleteMedia$1$result$1(this.this$0, this.$relativePath, this.$recursive, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchMediaDeletionManager hatchMediaDeletionManager = this.this$0;
            String str = this.$relativePath;
            boolean z = this.$recursive;
            this.label = 1;
            obj = hatchMediaDeletionManager.deleteAndReconcile(str, z, this);
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

    @Override // X.G0U
    public final Object invoke(HtJ<? super Boolean> htJ) {
        return ((HatchMediaDeletionManager$deleteMedia$1$result$1) create(htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
