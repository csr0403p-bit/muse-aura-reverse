package com.facebook.aura.explore.repo;

import X.A6B;
import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.G0U;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class IdeaCardsResponseJson extends C06G {
    public final IdeaCardsPaginationJson pagination;
    public final List<IdeaSectionJson> sections;
    public final IdeaCardsViewerStateJson viewerState;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cI.A1Z(C79.A01, IdeaCardsResponseJson$Companion$$childSerializers$1.INSTANCE);

    /* loaded from: classes.dex */
    public final class Companion {
        public final C9hr<IdeaCardsResponseJson> serializer() {
            return IdeaCardsResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* renamed from: com.facebook.aura.explore.repo.IdeaCardsResponseJson$toDomain$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<IdeaSectionJson, IdeaCardSection> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ IdeaCardSection invoke(IdeaSectionJson ideaSectionJson) {
            IdeaSectionJson ideaSectionJson2 = ideaSectionJson;
            C7384Etj.A0Y(ideaSectionJson2, 0);
            return ideaSectionJson2.toDomain();
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final IdeaCardSection invoke2(IdeaSectionJson ideaSectionJson) {
            C7384Etj.A0Y(ideaSectionJson, 0);
            return ideaSectionJson.toDomain();
        }
    }

    /* renamed from: com.facebook.aura.explore.repo.IdeaCardsResponseJson$toDomain$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<IdeaCardSection, Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(IdeaCardSection ideaCardSection) {
            C7384Etj.A0Y(ideaCardSection, 0);
            return Boolean.valueOf(!ideaCardSection.cards.isEmpty());
        }
    }

    public IdeaCardsResponseJson(List<IdeaSectionJson> list, IdeaCardsViewerStateJson ideaCardsViewerStateJson, IdeaCardsPaginationJson ideaCardsPaginationJson) {
        C7384Etj.A0Y(list, 0);
        this.sections = list;
        this.viewerState = ideaCardsViewerStateJson;
        this.pagination = ideaCardsPaginationJson;
    }

    public final IdeaCardsResponseJson copy(List<IdeaSectionJson> list, IdeaCardsViewerStateJson ideaCardsViewerStateJson, IdeaCardsPaginationJson ideaCardsPaginationJson) {
        C7384Etj.A0Y(list, 0);
        return new IdeaCardsResponseJson(list, ideaCardsViewerStateJson, ideaCardsPaginationJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaCardsResponseJson) {
                IdeaCardsResponseJson ideaCardsResponseJson = (IdeaCardsResponseJson) obj;
                if (!C7384Etj.areEqual(this.sections, ideaCardsResponseJson.sections) || !C7384Etj.areEqual(this.viewerState, ideaCardsResponseJson.viewerState) || !C7384Etj.areEqual(this.pagination, ideaCardsResponseJson.pagination)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IdeaCardsResponseJson copy$default(IdeaCardsResponseJson ideaCardsResponseJson, List list, IdeaCardsViewerStateJson ideaCardsViewerStateJson, IdeaCardsPaginationJson ideaCardsPaginationJson, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ideaCardsResponseJson.sections;
        }
        if ((i & 2) != 0) {
            ideaCardsViewerStateJson = ideaCardsResponseJson.viewerState;
        }
        if ((i & 4) != 0) {
            ideaCardsPaginationJson = ideaCardsResponseJson.pagination;
        }
        return ideaCardsResponseJson.copy(list, ideaCardsViewerStateJson, ideaCardsPaginationJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_explore_repo_repo(IdeaCardsResponseJson ideaCardsResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(ideaCardsResponseJson.sections)) {
            c9j5.AAQ(ideaCardsResponseJson.sections, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || ideaCardsResponseJson.viewerState != null) {
            c9j5.AAP(ideaCardsResponseJson.viewerState, IdeaCardsViewerStateJson$$serializer.INSTANCE, c9iZ, 1);
        }
        if (zAfR || ideaCardsResponseJson.pagination != null) {
            c9j5.AAP(ideaCardsResponseJson.pagination, IdeaCardsPaginationJson$$serializer.INSTANCE, c9iZ, 2);
        }
    }

    public final List<IdeaSectionJson> component1() {
        return this.sections;
    }

    public final IdeaCardsViewerStateJson component2() {
        return this.viewerState;
    }

    public final IdeaCardsPaginationJson component3() {
        return this.pagination;
    }

    public final IdeaCardsPaginationJson getPagination() {
        return this.pagination;
    }

    public final List<IdeaSectionJson> getSections() {
        return this.sections;
    }

    public final IdeaCardsViewerStateJson getViewerState() {
        return this.viewerState;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0E(this.sections) + AnonymousClass006.A0D(this.viewerState)) * 31) + C3cH.A02(this.pagination);
    }

    public final IdeaCardsFeedResponse toDomain() {
        AHD ahdA07 = AGI.A07(A6B.A02(A6B.A03(AnonymousClass2.INSTANCE, A6B.A08(AnonymousClass1.INSTANCE, AbstractC0878AGe.A06(this.sections)))));
        IdeaCardsViewerStateJson ideaCardsViewerStateJson = this.viewerState;
        boolean z = false;
        boolean z2 = ideaCardsViewerStateJson != null ? ideaCardsViewerStateJson.hasBuiltIdea : false;
        IdeaCardsPaginationJson ideaCardsPaginationJson = this.pagination;
        String str = null;
        if (ideaCardsPaginationJson != null) {
            String str2 = ideaCardsPaginationJson.nextCursor;
            if (str2 != null && str2.length() > 0) {
                str = str2;
            }
            if (ideaCardsPaginationJson.hasNextPage) {
                z = true;
            }
        }
        return new IdeaCardsFeedResponse(ahdA07, z2, str, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ IdeaCardsResponseJson(int i, List list, IdeaCardsViewerStateJson ideaCardsViewerStateJson, IdeaCardsPaginationJson ideaCardsPaginationJson, C2hx c2hx) {
        this.sections = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.viewerState = null;
        } else {
            this.viewerState = ideaCardsViewerStateJson;
        }
        if ((i & 4) == 0) {
            this.pagination = null;
        } else {
            this.pagination = ideaCardsPaginationJson;
        }
    }

    public /* synthetic */ IdeaCardsResponseJson(List list, IdeaCardsViewerStateJson ideaCardsViewerStateJson, IdeaCardsPaginationJson ideaCardsPaginationJson, int i, C06H c06h) {
        this(C3cI.A10(list, i), (i & 2) != 0 ? null : ideaCardsViewerStateJson, (i & 4) != 0 ? null : ideaCardsPaginationJson);
    }

    public IdeaCardsResponseJson() {
        this(C0881AGi.A00, null, null);
    }
}
