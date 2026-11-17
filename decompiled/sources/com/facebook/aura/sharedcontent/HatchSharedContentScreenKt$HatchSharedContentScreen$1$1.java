package com.facebook.aura.sharedcontent;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.widget.Toast;
import com.facebook.aura.file.actions.HatchShare;
import com.facebook.aura.sharedcontent.SharedContentEffect;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharedcontent.HatchSharedContentScreenKt$HatchSharedContentScreen$1$1", f = "HatchSharedContentScreen.kt", l = {88}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchSharedContentScreenKt$HatchSharedContentScreen$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $saveFailedToast;
    public final /* synthetic */ String $savedToast;
    public final /* synthetic */ SharedContentViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSharedContentScreenKt$HatchSharedContentScreen$1$1(SharedContentViewModel sharedContentViewModel, Context context, String str, String str2, HtJ<? super HatchSharedContentScreenKt$HatchSharedContentScreen$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = sharedContentViewModel;
        this.$context = context;
        this.$savedToast = str;
        this.$saveFailedToast = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchSharedContentScreenKt$HatchSharedContentScreen$1$1(this.$viewModel, this.$context, this.$savedToast, this.$saveFailedToast, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<SharedContentEffect> c22i = this.$viewModel.effects;
            final Context context = this.$context;
            final String str = this.$savedToast;
            final String str2 = this.$saveFailedToast;
            C20Z<? super SharedContentEffect> c20z = new C20Z() { // from class: com.facebook.aura.sharedcontent.HatchSharedContentScreenKt$HatchSharedContentScreen$1$1.1
                public final Object emit(SharedContentEffect sharedContentEffect, HtJ<? super Unit> htJ) {
                    Context context2;
                    String str3;
                    if (sharedContentEffect instanceof SharedContentEffect.ShareUrl) {
                        HatchShare.INSTANCE.shareUrl(context, ((SharedContentEffect.ShareUrl) sharedContentEffect).url, null, null);
                    } else {
                        if (C7384Etj.areEqual(sharedContentEffect, SharedContentEffect.SavedToHatch.INSTANCE)) {
                            context2 = context;
                            str3 = str;
                        } else {
                            if (!(sharedContentEffect instanceof SharedContentEffect.SaveFailed)) {
                                throw C3cG.A0q();
                            }
                            context2 = context;
                            str3 = str2;
                        }
                        Toast.makeText(context2, str3, 0).show();
                    }
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((SharedContentEffect) obj2, (HtJ<? super Unit>) htJ);
                }
            };
            this.label = 1;
            if (c22i.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw C3cG.A0p();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchSharedContentScreenKt$HatchSharedContentScreen$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
