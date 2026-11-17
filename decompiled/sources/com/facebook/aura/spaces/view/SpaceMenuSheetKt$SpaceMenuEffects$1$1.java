package com.facebook.aura.spaces.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.view.View;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.SpaceNavigationIdKt;
import com.facebook.aura.spaces.model.AuraNavBarViewModel;
import com.facebook.aura.spaces.view.SpaceMenuEffect;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.spaces.view.SpaceMenuSheetKt$SpaceMenuEffects$1$1", f = "SpaceMenuSheet.kt", l = {157}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class SpaceMenuSheetKt$SpaceMenuEffects$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ SpaceMenuViewModel $model;
    public final /* synthetic */ String $moveFailedMessage;
    public final /* synthetic */ AuraNavBarViewModel $navBarViewModel;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onDeleted;
    public final /* synthetic */ Function0<Unit> $onRenamed;
    public final /* synthetic */ String $renameBusyMessage;
    public final /* synthetic */ String $renameFailedMessage;
    public final /* synthetic */ String $sidebarFullMessage;
    public final /* synthetic */ String $slug;
    public final /* synthetic */ View $viewRoot;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceMenuSheetKt$SpaceMenuEffects$1$1(SpaceMenuViewModel spaceMenuViewModel, Function0<Unit> function0, AuraNavigator auraNavigator, Function0<Unit> function02, AuraNavBarViewModel auraNavBarViewModel, String str, String str2, String str3, String str4, String str5, View view, HtJ<? super SpaceMenuSheetKt$SpaceMenuEffects$1$1> htJ) {
        super(2, htJ);
        this.$model = spaceMenuViewModel;
        this.$onDeleted = function0;
        this.$navigator = auraNavigator;
        this.$onRenamed = function02;
        this.$navBarViewModel = auraNavBarViewModel;
        this.$slug = str;
        this.$sidebarFullMessage = str2;
        this.$renameBusyMessage = str3;
        this.$renameFailedMessage = str4;
        this.$moveFailedMessage = str5;
        this.$viewRoot = view;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SpaceMenuSheetKt$SpaceMenuEffects$1$1(this.$model, this.$onDeleted, this.$navigator, this.$onRenamed, this.$navBarViewModel, this.$slug, this.$sidebarFullMessage, this.$renameBusyMessage, this.$renameFailedMessage, this.$moveFailedMessage, this.$viewRoot, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C20Q<SpaceMenuEffect> c20q = this.$model.effects;
            final Function0<Unit> function0 = this.$onDeleted;
            final AuraNavigator auraNavigator = this.$navigator;
            final Function0<Unit> function02 = this.$onRenamed;
            final AuraNavBarViewModel auraNavBarViewModel = this.$navBarViewModel;
            final String str = this.$slug;
            final String str2 = this.$sidebarFullMessage;
            final String str3 = this.$renameBusyMessage;
            final String str4 = this.$renameFailedMessage;
            final String str5 = this.$moveFailedMessage;
            final View view = this.$viewRoot;
            C20Z<? super SpaceMenuEffect> c20z = new C20Z() { // from class: com.facebook.aura.spaces.view.SpaceMenuSheetKt$SpaceMenuEffects$1$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((SpaceMenuEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(SpaceMenuEffect spaceMenuEffect, HtJ<? super Unit> htJ) {
                    String str6;
                    if (spaceMenuEffect instanceof SpaceMenuEffect.Moved) {
                        if (((SpaceMenuEffect.Moved) spaceMenuEffect).toLibrary) {
                            function0.invoke();
                        } else {
                            auraNavigator.back();
                        }
                    } else {
                        if (C7384Etj.areEqual(spaceMenuEffect, SpaceMenuEffect.Renamed.INSTANCE)) {
                            function02.invoke();
                        } else if (spaceMenuEffect instanceof SpaceMenuEffect.Pinned) {
                            boolean z = ((SpaceMenuEffect.Pinned) spaceMenuEffect).pinned;
                            AuraNavBarViewModel auraNavBarViewModel2 = auraNavBarViewModel;
                            String strSpaceNavigationId = SpaceNavigationIdKt.spaceNavigationId(str);
                            if (z) {
                                auraNavBarViewModel2.pinItem(strSpaceNavigationId);
                            } else {
                                auraNavBarViewModel2.unpinItem(strSpaceNavigationId);
                            }
                        } else if (spaceMenuEffect instanceof SpaceMenuEffect.Failed) {
                            int i2 = ((SpaceMenuEffect.Failed) spaceMenuEffect).message;
                            if (i2 == R.string._name_removed__res_0x7f120487) {
                                str6 = str2;
                            } else if (i2 == R.string._name_removed__res_0x7f12060b) {
                                str6 = str3;
                            } else if (i2 == R.string._name_removed__res_0x7f12060d) {
                                str6 = str4;
                            } else {
                                str6 = str5;
                            }
                            AnonymousClass007.A0n(view, AuraToast.Companion, str6);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        auraNavigator.back();
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c20q.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((SpaceMenuSheetKt$SpaceMenuEffects$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
