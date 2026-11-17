package com.facebook.aura.spacesharing.impl;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C1BN;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.spaces.repo.HatchSpacesData;
import com.facebook.aura.spaces.repo.HatchSpacesDataSource;
import com.facebook.aura.spaces.repo.LoadingState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.spacesharing.impl.SharedSpaceSavedLookupKt$isSavedSpaceInSidebar$data$1", f = "SharedSpaceSavedLookup.kt", l = {57}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class SharedSpaceSavedLookupKt$isSavedSpaceInSidebar$data$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchSpacesData>, Object> {
    public final /* synthetic */ HatchSpacesDataSource $spaces;
    public int label;

    @DebugMetadata(c = "com.facebook.aura.spacesharing.impl.SharedSpaceSavedLookupKt$isSavedSpaceInSidebar$data$1$1", f = "SharedSpaceSavedLookup.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.spacesharing.impl.SharedSpaceSavedLookupKt$isSavedSpaceInSidebar$data$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<HatchSpacesData, HtJ<? super Boolean>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.G0V
        public final Object invoke(HatchSpacesData hatchSpacesData, HtJ<? super Boolean> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
            anonymousClass1.L$0 = hatchSpacesData;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchSpacesData hatchSpacesData = (HatchSpacesData) this.L$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(AnonymousClass006.A1Z(hatchSpacesData.loadingState, LoadingState.LOADING));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSpaceSavedLookupKt$isSavedSpaceInSidebar$data$1(HatchSpacesDataSource hatchSpacesDataSource, HtJ<? super SharedSpaceSavedLookupKt$isSavedSpaceInSidebar$data$1> htJ) {
        super(2, htJ);
        this.$spaces = hatchSpacesDataSource;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SharedSpaceSavedLookupKt$isSavedSpaceInSidebar$data$1(this.$spaces, htJ);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super HatchSpacesData> htJ) {
        return new SharedSpaceSavedLookupKt$isSavedSpaceInSidebar$data$1(this.$spaces, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C1BN<HatchSpacesData> c1bn = this.$spaces.data;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            obj = AbstractC9777Gfy.A00(this, anonymousClass1, c1bn);
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
}
