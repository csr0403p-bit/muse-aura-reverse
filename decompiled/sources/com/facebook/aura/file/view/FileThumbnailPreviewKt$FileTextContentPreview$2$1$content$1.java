package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.gateway.HatchFileOperations;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.FileThumbnailPreviewKt$FileTextContentPreview$2$1$content$1", f = "FileThumbnailPreview.kt", l = {405}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class FileThumbnailPreviewKt$FileTextContentPreview$2$1$content$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super String>, Object> {
    public final /* synthetic */ String $relativePath;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileThumbnailPreviewKt$FileTextContentPreview$2$1$content$1(String str, AbstractC3358CGz abstractC3358CGz, HtJ<? super FileThumbnailPreviewKt$FileTextContentPreview$2$1$content$1> htJ) {
        super(2, htJ);
        this.$relativePath = str;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FileThumbnailPreviewKt$FileTextContentPreview$2$1$content$1(this.$relativePath, this.$userSession, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchFileOperations hatchFileOperations = HatchFileOperations.INSTANCE;
            String str = this.$relativePath;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            this.label = 1;
            obj = hatchFileOperations.readFile(str, abstractC3358CGz, this);
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
    public final Object invoke(C3UX c3ux, HtJ<? super String> htJ) {
        return ((FileThumbnailPreviewKt$FileTextContentPreview$2$1$content$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
