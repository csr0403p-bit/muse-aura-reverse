package com.facebook.aura.file.view;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.net.Uri;
import com.facebook.aura.gateway.HatchFileOperations;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.file.view.LibraryUploadMenuKt$LibraryUploadMenu$upload$1$1$1$result$1", f = "LibraryUploadMenu.kt", l = {104}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class LibraryUploadMenuKt$LibraryUploadMenu$upload$1$1$1$result$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchFileOperations.WriteResult>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $fallbackName;
    public final /* synthetic */ String $folderPath;
    public final /* synthetic */ Uri $uri;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUploadMenuKt$LibraryUploadMenu$upload$1$1$1$result$1(Context context, Uri uri, String str, String str2, AbstractC3358CGz abstractC3358CGz, HtJ<? super LibraryUploadMenuKt$LibraryUploadMenu$upload$1$1$1$result$1> htJ) {
        super(2, htJ);
        this.$context = context;
        this.$uri = uri;
        this.$fallbackName = str;
        this.$folderPath = str2;
        this.$userSession = abstractC3358CGz;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new LibraryUploadMenuKt$LibraryUploadMenu$upload$1$1$1$result$1(this.$context, this.$uri, this.$fallbackName, this.$folderPath, this.$userSession, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            Context context = this.$context;
            Uri uri = this.$uri;
            String str = this.$fallbackName;
            String str2 = this.$folderPath;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            this.label = 1;
            obj = LibraryUploadMenuKt.uploadLibraryUri$default(context, uri, str, str2, abstractC3358CGz, null, null, null, this, 224, null);
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
    public final Object invoke(C3UX c3ux, HtJ<? super HatchFileOperations.WriteResult> htJ) {
        return ((LibraryUploadMenuKt$LibraryUploadMenu$upload$1$1$1$result$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
