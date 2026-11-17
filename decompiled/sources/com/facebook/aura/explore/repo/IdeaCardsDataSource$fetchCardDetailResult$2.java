package com.facebook.aura.explore.repo;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.C10571Hud;
import X.C3UX;
import X.C9jH;
import X.EnumC10460Hji;
import X.G0V;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.explore.repo.ExploreJarvisPath;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.explore.repo.IdeaCardsDataSource$fetchCardDetailResult$2", f = "IdeaCardsDataSource.kt", l = {545}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class IdeaCardsDataSource$fetchCardDetailResult$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HsJ<? extends IdeaCardDetail>>, Object> {
    public final /* synthetic */ String $ideaCardId;
    public int I$0;
    public int I$1;
    public int I$2;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public int label;
    public final /* synthetic */ IdeaCardsDataSource this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdeaCardsDataSource$fetchCardDetailResult$2(String str, IdeaCardsDataSource ideaCardsDataSource, HtJ<? super IdeaCardsDataSource$fetchCardDetailResult$2> htJ) {
        super(2, htJ);
        this.$ideaCardId = str;
        this.this$0 = ideaCardsDataSource;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new IdeaCardsDataSource$fetchCardDetailResult$2(this.$ideaCardId, this.this$0, htJ);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super HsJ<? extends IdeaCardDetail>> htJ) {
        return invoke2(c3ux, (HtJ<? super HsJ<IdeaCardDetail>>) htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object objM1595executeBodylessJarvisRequestWithp3iPjrY;
        C10571Hud c10571Hud;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            ExploreJarvisPath.IdeaCard ideaCard = new ExploreJarvisPath.IdeaCard(this.$ideaCardId);
            HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
            HxE<String, Object>[] hxEArrIdeaCardsQueryParams = IdeaCardsDataSourceKt.ideaCardsQueryParams(null);
            HxE<String, ? extends Object>[] hxEArr = (HxE[]) Arrays.copyOf(hxEArrIdeaCardsQueryParams, hxEArrIdeaCardsQueryParams.length);
            RequestType requestType = RequestType.GET;
            AbstractC3358CGz abstractC3358CGz = this.this$0.userSession;
            Long l = new Long(60L);
            Set<Integer> setA18 = AnonymousClass004.A18();
            C9jH c9jHA0E = AGH.A0E();
            IdeaCardsDataSource$fetchCardDetailResult$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 ideaCardsDataSource$fetchCardDetailResult$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 = IdeaCardsDataSource$fetchCardDetailResult$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1.INSTANCE;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.L$8 = null;
            this.I$0 = 1;
            this.I$1 = 1;
            this.I$2 = 0;
            this.label = 1;
            objM1595executeBodylessJarvisRequestWithp3iPjrY = hatchHttpApi.m1595executeBodylessJarvisRequestWithp3iPjrY(ideaCardsDataSource$fetchCardDetailResult$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1, false, ideaCard, requestType, abstractC3358CGz, l, hxEArr, null, setA18, true, c9jHA0E, true, null, false, this);
            if (objM1595executeBodylessJarvisRequestWithp3iPjrY == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            objM1595executeBodylessJarvisRequestWithp3iPjrY = AnonymousClass002.A0j(obj);
        }
        Throwable thA00 = HsJ.A00(objM1595executeBodylessJarvisRequestWithp3iPjrY);
        if (thA00 == null) {
            try {
                IdeaCardDetail domain = ((IdeaCardDetailResponseJson) objM1595executeBodylessJarvisRequestWithp3iPjrY).toDomain();
                if (domain == 0) {
                    throw new IllegalStateException("Idea card response is missing the card");
                }
                this.this$0.refreshSharingOverrides(Collections.singletonList(new HxE(domain.ideaCardId, domain.sharing)));
                c10571Hud = domain;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                return new HsJ(new C10571Hud(e2));
            }
        } else {
            c10571Hud = new C10571Hud(thA00);
        }
        return new HsJ(c10571Hud);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(C3UX c3ux, HtJ<? super HsJ<IdeaCardDetail>> htJ) {
        return ((IdeaCardsDataSource$fetchCardDetailResult$2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
