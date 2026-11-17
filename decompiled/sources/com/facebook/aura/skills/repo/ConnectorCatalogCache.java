package com.facebook.aura.skills.repo;

import X.A3q;
import X.AGH;
import X.AGI;
import X.AHD;
import X.AHH;
import X.AIW;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BGK;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C20Q;
import X.C7384Etj;
import X.C9286GCn;
import X.G0U;
import X.GDB;
import android.os.SystemClock;
import com.facebook.aura.skills.model.ConnectorCatalogCategory;
import com.facebook.aura.skills.model.ConnectorCatalogHomepage;
import com.facebook.aura.skills.model.ConnectorCatalogKt;
import com.facebook.aura.skills.model.ConnectorCatalogPage;
import com.facebook.aura.skills.model.ConnectorCatalogQuery;
import com.facebook.aura.skills.model.ConnectorCatalogSection;
import com.facebook.aura.skills.model.Skill;
import com.facebook.aura.skills.model.SkillState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class ConnectorCatalogCache {
    public static final String CONNECTED = "connected";
    public static final Companion Companion = new Companion();
    public static final int MAX_CATEGORIES = 20;
    public static final int MAX_CONNECTORS = 1000;
    public static final int MAX_QUERIES = 20;
    public final BLG<State> state;
    public final Object lock = new Object();
    public final Map<ConnectorCatalogQuery, Integer> readers = new LinkedHashMap();
    public final Map<String, Integer> connectorReaders = new LinkedHashMap();
    public final HatchSkillIconUrlReconciler icons = new HatchSkillIconUrlReconciler();

    public final class Homepage extends C06G {
        public final int customCount;
        public final List<String> featuredIds;
        public final long fetchedAtMs;
        public final long generation;
        public final List<Section> sections;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Homepage) {
                    Homepage homepage = (Homepage) obj;
                    if (!C7384Etj.areEqual(this.featuredIds, homepage.featuredIds) || !C7384Etj.areEqual(this.sections, homepage.sections) || this.customCount != homepage.customCount || this.generation != homepage.generation || this.fetchedAtMs != homepage.fetchedAtMs) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Homepage copy$default(Homepage homepage, List list, List list2, int i, long j, long j2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = homepage.featuredIds;
            }
            if ((i2 & 2) != 0) {
                list2 = homepage.sections;
            }
            if ((i2 & 4) != 0) {
                i = homepage.customCount;
            }
            if ((i2 & 8) != 0) {
                j = homepage.generation;
            }
            if ((i2 & 16) != 0) {
                j2 = homepage.fetchedAtMs;
            }
            return homepage.copy(list, list2, i, j, j2);
        }

        public final List<String> allIds() {
            List<String> list = this.featuredIds;
            List<Section> list2 = this.sections;
            ArrayList arrayList = new ArrayList();
            Iterator<Section> it = list2.iterator();
            while (it.hasNext()) {
                AbstractC0882AGj.A0r(it.next().ids, arrayList);
            }
            return AbstractC0878AGe.A0P(arrayList, list);
        }

        public final List<String> component1() {
            return this.featuredIds;
        }

        public final List<Section> component2() {
            return this.sections;
        }

        public final int component3() {
            return this.customCount;
        }

        public final long component4() {
            return this.generation;
        }

        public final long component5() {
            return this.fetchedAtMs;
        }

        public final int getCustomCount() {
            return this.customCount;
        }

        public final List<String> getFeaturedIds() {
            return this.featuredIds;
        }

        public final long getFetchedAtMs() {
            return this.fetchedAtMs;
        }

        public final long getGeneration() {
            return this.generation;
        }

        public final List<Section> getSections() {
            return this.sections;
        }

        public int hashCode() {
            int iA06 = AnonymousClass006.A06(this.generation, (AnonymousClass005.A0F(this.sections, AnonymousClass005.A0E(this.featuredIds)) + this.customCount) * 31);
            long j = this.fetchedAtMs;
            return iA06 + ((int) (j ^ (j >>> 32)));
        }

        public Homepage(List<String> list, List<Section> list2, int i, long j, long j2) {
            AnonymousClass003.A0u(list, list2);
            this.featuredIds = list;
            this.sections = list2;
            this.customCount = i;
            this.generation = j;
            this.fetchedAtMs = j2;
        }

        public final Homepage copy(List<String> list, List<Section> list2, int i, long j, long j2) {
            AnonymousClass003.A0u(list, list2);
            return new Homepage(list, list2, i, j, j2);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Membership extends C06G {
        public final boolean complete;
        public final Set<String> ids;

        public Membership(Set<String> set, boolean z) {
            C7384Etj.A0Y(set, 0);
            this.ids = set;
            this.complete = z;
        }

        public final Membership copy(Set<String> set, boolean z) {
            C7384Etj.A0Y(set, 0);
            return new Membership(set, z);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Membership) {
                    Membership membership = (Membership) obj;
                    if (!C7384Etj.areEqual(this.ids, membership.ids) || this.complete != membership.complete) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Membership copy$default(Membership membership, Set set, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                set = membership.ids;
            }
            if ((i & 2) != 0) {
                z = membership.complete;
            }
            C7384Etj.A0Y(set, 0);
            return new Membership(set, z);
        }

        public final Set<String> component1() {
            return this.ids;
        }

        public final boolean component2() {
            return this.complete;
        }

        public final boolean getComplete() {
            return this.complete;
        }

        public final Set<String> getIds() {
            return this.ids;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0E(this.ids), this.complete);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Membership(Set set, boolean z, int i, C06H c06h) {
            this((i & 1) != 0 ? A3q.A00 : set, AnonymousClass001.A1Q(i, z));
        }

        public Membership() {
            this(A3q.A00, false);
        }
    }

    public final class Page extends C06G {
        public final ConnectorCatalogCategory category;
        public final List<String> featuredIds;
        public final long firstPageFetchedAtMs;
        public final long generation;
        public final List<String> ids;
        public final String nextCursor;
        public final int totalCount;
        public final Set<String> usedCursors;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Page) {
                    Page page = (Page) obj;
                    if (!C7384Etj.areEqual(this.ids, page.ids) || !C7384Etj.areEqual(this.featuredIds, page.featuredIds) || !C7384Etj.areEqual(this.category, page.category) || !C7384Etj.areEqual(this.nextCursor, page.nextCursor) || this.totalCount != page.totalCount || this.firstPageFetchedAtMs != page.firstPageFetchedAtMs || this.generation != page.generation || !C7384Etj.areEqual(this.usedCursors, page.usedCursors)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Page copy$default(Page page, List list, List list2, ConnectorCatalogCategory connectorCatalogCategory, String str, int i, long j, long j2, Set set, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                list = page.ids;
            }
            if ((i2 & 2) != 0) {
                list2 = page.featuredIds;
            }
            if ((i2 & 4) != 0) {
                connectorCatalogCategory = page.category;
            }
            if ((i2 & 8) != 0) {
                str = page.nextCursor;
            }
            if ((i2 & 16) != 0) {
                i = page.totalCount;
            }
            if ((i2 & 32) != 0) {
                j = page.firstPageFetchedAtMs;
            }
            if ((i2 & 64) != 0) {
                j2 = page.generation;
            }
            if ((i2 & 128) != 0) {
                set = page.usedCursors;
            }
            return page.copy(list, list2, connectorCatalogCategory, str, i, j, j2, set);
        }

        public final List<String> component1() {
            return this.ids;
        }

        public final List<String> component2() {
            return this.featuredIds;
        }

        public final ConnectorCatalogCategory component3() {
            return this.category;
        }

        public final String component4() {
            return this.nextCursor;
        }

        public final int component5() {
            return this.totalCount;
        }

        public final long component6() {
            return this.firstPageFetchedAtMs;
        }

        public final long component7() {
            return this.generation;
        }

        public final Set<String> component8() {
            return this.usedCursors;
        }

        public final ConnectorCatalogCategory getCategory() {
            return this.category;
        }

        public final List<String> getFeaturedIds() {
            return this.featuredIds;
        }

        public final long getFirstPageFetchedAtMs() {
            return this.firstPageFetchedAtMs;
        }

        public final long getGeneration() {
            return this.generation;
        }

        public final List<String> getIds() {
            return this.ids;
        }

        public final String getNextCursor() {
            return this.nextCursor;
        }

        public final int getTotalCount() {
            return this.totalCount;
        }

        public final Set<String> getUsedCursors() {
            return this.usedCursors;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.usedCursors, AnonymousClass006.A06(this.generation, AnonymousClass006.A06(this.firstPageFetchedAtMs, (((((AnonymousClass005.A0F(this.featuredIds, AnonymousClass005.A0E(this.ids)) + AnonymousClass006.A0D(this.category)) * 31) + AnonymousClass005.A0H(this.nextCursor)) * 31) + this.totalCount) * 31)));
        }

        public Page(List<String> list, List<String> list2, ConnectorCatalogCategory connectorCatalogCategory, String str, int i, long j, long j2, Set<String> set) {
            AnonymousClass003.A0u(list, list2);
            C7384Etj.A0Y(set, 7);
            this.ids = list;
            this.featuredIds = list2;
            this.category = connectorCatalogCategory;
            this.nextCursor = str;
            this.totalCount = i;
            this.firstPageFetchedAtMs = j;
            this.generation = j2;
            this.usedCursors = set;
        }

        public final Page copy(List<String> list, List<String> list2, ConnectorCatalogCategory connectorCatalogCategory, String str, int i, long j, long j2, Set<String> set) {
            AnonymousClass003.A0u(list, list2);
            C7384Etj.A0Y(set, 7);
            return new Page(list, list2, connectorCatalogCategory, str, i, j, j2, set);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Section extends C06G {
        public final ConnectorCatalogCategory category;
        public final List<String> ids;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Section) {
                    Section section = (Section) obj;
                    if (!C7384Etj.areEqual(this.category, section.category) || !C7384Etj.areEqual(this.ids, section.ids)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Section copy$default(Section section, ConnectorCatalogCategory connectorCatalogCategory, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                connectorCatalogCategory = section.category;
            }
            if ((i & 2) != 0) {
                list = section.ids;
            }
            AnonymousClass003.A0u(connectorCatalogCategory, list);
            return new Section(connectorCatalogCategory, list);
        }

        public final ConnectorCatalogCategory component1() {
            return this.category;
        }

        public final List<String> component2() {
            return this.ids;
        }

        public final ConnectorCatalogCategory getCategory() {
            return this.category;
        }

        public final List<String> getIds() {
            return this.ids;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.ids, AnonymousClass005.A0E(this.category));
        }

        public Section(ConnectorCatalogCategory connectorCatalogCategory, List<String> list) {
            AnonymousClass003.A0u(connectorCatalogCategory, list);
            this.category = connectorCatalogCategory;
            this.ids = list;
        }

        public final Section copy(ConnectorCatalogCategory connectorCatalogCategory, List<String> list) {
            AnonymousClass003.A0u(connectorCatalogCategory, list);
            return new Section(connectorCatalogCategory, list);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class State extends C06G {
        public final Map<String, Skill> connectors;
        public final long generation;
        public final Homepage home;
        public final Map<String, Membership> memberships;
        public final Set<String> optimistic;
        public final Map<ConnectorCatalogQuery, Page> pages;
        public final Set<String> staleIds;

        public final State copy(long j, Map<String, Skill> map, Homepage homepage, Map<ConnectorCatalogQuery, Page> map2, Map<String, Membership> map3, Set<String> set, Set<String> set2) {
            AnonymousClass005.A16(map, map2, map3, set, 1);
            C7384Etj.A0Y(set2, 6);
            return new State(j, map, homepage, map2, map3, set, set2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof State) {
                    State state = (State) obj;
                    if (this.generation != state.generation || !C7384Etj.areEqual(this.connectors, state.connectors) || !C7384Etj.areEqual(this.home, state.home) || !C7384Etj.areEqual(this.pages, state.pages) || !C7384Etj.areEqual(this.memberships, state.memberships) || !C7384Etj.areEqual(this.optimistic, state.optimistic) || !C7384Etj.areEqual(this.staleIds, state.staleIds)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public State() {
            long j = 0;
            this(j, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ State copy$default(State state, long j, Map map, Homepage homepage, Map map2, Map map3, Set set, Set set2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = state.generation;
            }
            if ((i & 2) != 0) {
                map = state.connectors;
            }
            if ((i & 4) != 0) {
                homepage = state.home;
            }
            if ((i & 8) != 0) {
                map2 = state.pages;
            }
            if ((i & 16) != 0) {
                map3 = state.memberships;
            }
            if ((i & 32) != 0) {
                set = state.optimistic;
            }
            if ((i & 64) != 0) {
                set2 = state.staleIds;
            }
            return state.copy(j, map, homepage, map2, map3, set, set2);
        }

        public final long component1() {
            return this.generation;
        }

        public final Map<String, Skill> component2() {
            return this.connectors;
        }

        public final Homepage component3() {
            return this.home;
        }

        public final Map<ConnectorCatalogQuery, Page> component4() {
            return this.pages;
        }

        public final Map<String, Membership> component5() {
            return this.memberships;
        }

        public final Set<String> component6() {
            return this.optimistic;
        }

        public final Set<String> component7() {
            return this.staleIds;
        }

        public final Map<String, Skill> getConnectors() {
            return this.connectors;
        }

        public final long getGeneration() {
            return this.generation;
        }

        public final Homepage getHome() {
            return this.home;
        }

        public final Map<String, Membership> getMemberships() {
            return this.memberships;
        }

        public final Set<String> getOptimistic() {
            return this.optimistic;
        }

        public final Map<ConnectorCatalogQuery, Page> getPages() {
            return this.pages;
        }

        public final Set<String> getStaleIds() {
            return this.staleIds;
        }

        public int hashCode() {
            return AnonymousClass005.A0G(this.staleIds, AnonymousClass005.A0F(this.optimistic, AnonymousClass005.A0F(this.memberships, AnonymousClass005.A0F(this.pages, (AnonymousClass005.A0F(this.connectors, AnonymousClass002.A0A(this.generation) * 31) + AnonymousClass006.A0D(this.home)) * 31))));
        }

        public String toString() {
            return super.toString();
        }

        public State(long j, Map<String, Skill> map, Homepage homepage, Map<ConnectorCatalogQuery, Page> map2, Map<String, Membership> map3, Set<String> set, Set<String> set2) {
            AnonymousClass005.A16(map, map2, map3, set, 1);
            C7384Etj.A0Y(set2, 6);
            this.generation = j;
            this.connectors = map;
            this.home = homepage;
            this.pages = map2;
            this.memberships = map3;
            this.optimistic = set;
            this.staleIds = set2;
        }

        public /* synthetic */ State(long j, Map map, Homepage homepage, Map map2, Map map3, Set set, Set set2, int i, C06H c06h) {
            this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? AGH.A0E() : map, (i & 4) != 0 ? null : homepage, (i & 8) != 0 ? AGH.A0E() : map2, (i & 16) != 0 ? AGH.A0E() : map3, (i & 32) != 0 ? A3q.A00 : set, (i & 64) != 0 ? A3q.A00 : set2);
        }
    }

    /* renamed from: com.facebook.aura.skills.repo.ConnectorCatalogCache$publish$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Map.Entry<ConnectorCatalogQuery, Page>, Boolean> {
        public final /* synthetic */ LinkedHashMap<String, Skill> $records;

        @Override // X.G0U
        public final Boolean invoke(Map.Entry<ConnectorCatalogQuery, Page> entry) {
            C7384Etj.A0Y(entry, 0);
            Page value = entry.getValue();
            ArrayList arrayListA0P = AbstractC0878AGe.A0P(value.featuredIds, value.ids);
            LinkedHashMap<String, Skill> linkedHashMap = this.$records;
            boolean z = false;
            if (!(arrayListA0P instanceof Collection) || !arrayListA0P.isEmpty()) {
                Iterator it = arrayListA0P.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (!linkedHashMap.containsKey(it.next())) {
                        z = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LinkedHashMap<String, Skill> linkedHashMap) {
            super(1);
            this.$records = linkedHashMap;
        }
    }

    private final State updateConnectedMembership(State state, String str) {
        Skill skill = state.connectors.get(str);
        boolean zA1Z = AnonymousClass002.A1Z(skill != null ? skill.state : null, SkillState.CONNECTED);
        Membership membership = state.memberships.get("connected");
        if (membership == null) {
            membership = new Membership(A3q.A00, false);
        }
        Map<String, Membership> map = state.memberships;
        Set<String> set = membership.ids;
        Map<String, Membership> mapA11 = AnonymousClass006.A11("connected", new Membership(zA1Z ? BGK.A02(str, set) : BGK.A04(str, set), membership.complete), map);
        Membership membership2 = state.memberships.get(ConnectorCatalogKt.CUSTOM_CATEGORY_ID);
        if (membership2 != null) {
            Skill skill2 = state.connectors.get(str);
            mapA11 = AnonymousClass006.A11(ConnectorCatalogKt.CUSTOM_CATEGORY_ID, new Membership((skill2 == null || !skill2.isCustom) ? BGK.A04(str, membership2.ids) : BGK.A02(str, membership2.ids), membership2.complete), mapA11);
        }
        ConnectorCatalogQuery.Category category = new ConnectorCatalogQuery.Category("connected");
        Page page = state.pages.get(category);
        Map<ConnectorCatalogQuery, Page> mapA112 = state.pages;
        if (page != null) {
            List<String> list = page.ids;
            mapA112 = AnonymousClass006.A11(category, page.copy(zA1Z ? AbstractC0878AGe.A0T(AbstractC0878AGe.A0Q(str, list)) : AbstractC0878AGe.A0b(list, str), page.featuredIds, page.category, page.nextCursor, page.totalCount, page.firstPageFetchedAtMs, page.generation, page.usedCursors), mapA112);
        }
        return state.copy(state.generation, state.connectors, state.home, mapA112, mapA11, state.optimistic, state.staleIds);
    }

    public final boolean clearPromotion(String str) {
        boolean z;
        C7384Etj.A0Y(str, 0);
        synchronized (this.lock) {
            State value = this.state.getValue();
            z = false;
            if (value != null && value.optimistic.contains(str)) {
                publish(value.copy(value.generation, value.connectors, value.home, value.pages, value.memberships, BGK.A04(str, value.optimistic), value.staleIds));
                z = true;
            }
        }
        return z;
    }

    public final Skill connector(String str) {
        Map<String, Skill> map;
        C7384Etj.A0Y(str, 0);
        State stateA0f = AnonymousClass006.A0f(this);
        if (stateA0f == null || (map = stateA0f.connectors) == null) {
            return null;
        }
        return map.get(str);
    }

    public final boolean hasFreshPage(ConnectorCatalogQuery connectorCatalogQuery, boolean z, Long l) {
        Page page;
        C7384Etj.A0Y(connectorCatalogQuery, 0);
        State stateA0f = AnonymousClass006.A0f(this);
        if (stateA0f == null || (page = stateA0f.pages.get(connectorCatalogQuery)) == null || page.generation != stateA0f.generation) {
            return false;
        }
        if (!z || page.nextCursor == null) {
            return l == null || SystemClock.elapsedRealtime() - page.firstPageFetchedAtMs < l.longValue();
        }
        return false;
    }

    public final boolean isConnectorStale(String str) {
        Set set;
        C7384Etj.A0Y(str, 0);
        State stateA0f = AnonymousClass006.A0f(this);
        if (stateA0f == null || (set = stateA0f.staleIds) == null) {
            set = A3q.A00;
        }
        return set.contains(str);
    }

    public final C20Q<Skill> observeConnector(String str) {
        C7384Etj.A0Y(str, 0);
        return GDB.A01(new ConnectorCatalogCache$observeConnector$$inlined$map$1(this.state, str));
    }

    public final C20Q<ConnectorCatalogPage> observePage(ConnectorCatalogQuery connectorCatalogQuery) {
        C7384Etj.A0Y(connectorCatalogQuery, 0);
        return GDB.A01(new ConnectorCatalogCache$observePage$$inlined$map$1(this.state, this, connectorCatalogQuery));
    }

    public final Skill putConnector(long j, Skill skill) {
        Skill skill2;
        C7384Etj.A0Y(skill, 1);
        synchronized (this.lock) {
            State stateUpdateConnectedMembership = updateConnectedMembership(merge(current(j), Collections.singletonList(skill), true), skill.id);
            Skill skill3 = stateUpdateConnectedMembership.connectors.get(skill.id);
            if (skill3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            skill2 = skill3;
            publish(stateUpdateConnectedMembership);
        }
        return skill2;
    }

    public final ConnectorCatalogHomepage putHomepage(long j, ConnectorCatalogHomepage connectorCatalogHomepage) {
        ConnectorCatalogHomepage connectorCatalogHomepageHomepage;
        C7384Etj.A0Y(connectorCatalogHomepage, 1);
        synchronized (this.lock) {
            State stateCurrent = current(j);
            AHD<Skill> ahd = connectorCatalogHomepage.featured;
            AHD<ConnectorCatalogSection> ahd2 = connectorCatalogHomepage.categories;
            ArrayList arrayList = new ArrayList();
            Iterator it = ahd2.iterator();
            while (it.hasNext()) {
                AbstractC0882AGj.A0r(((ConnectorCatalogSection) it.next()).connectors, arrayList);
            }
            State stateMerge = merge(stateCurrent, AbstractC0878AGe.A0P(arrayList, ahd), true);
            LinkedHashMap linkedHashMap = new LinkedHashMap(stateMerge.memberships);
            for (ConnectorCatalogSection connectorCatalogSection : connectorCatalogHomepage.categories) {
                Membership membership = (Membership) linkedHashMap.get(connectorCatalogSection.category.id);
                if (membership == null) {
                    membership = new Membership(A3q.A00, false);
                }
                String str = connectorCatalogSection.category.id;
                Set<String> set = membership.ids;
                AHD<Skill> ahd3 = connectorCatalogSection.connectors;
                ArrayList arrayListA0m = AnonymousClass002.A0m(ahd3);
                Iterator it2 = ahd3.iterator();
                while (it2.hasNext()) {
                    C06G.A0m(arrayListA0m, it2);
                }
                linkedHashMap.put(str, new Membership(BGK.A01(arrayListA0m, set), membership.complete));
            }
            AHD<Skill> ahd4 = connectorCatalogHomepage.featured;
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(ahd4);
            Iterator it3 = ahd4.iterator();
            while (it3.hasNext()) {
                C06G.A0m(arrayListA0m2, it3);
            }
            AHD<ConnectorCatalogSection> ahd5 = connectorCatalogHomepage.categories;
            ArrayList arrayListA0m3 = AnonymousClass002.A0m(ahd5);
            for (ConnectorCatalogSection connectorCatalogSection2 : ahd5) {
                ConnectorCatalogCategory connectorCatalogCategory = connectorCatalogSection2.category;
                AHD<Skill> ahd6 = connectorCatalogSection2.connectors;
                ArrayList arrayListA0m4 = AnonymousClass002.A0m(ahd6);
                Iterator it4 = ahd6.iterator();
                while (it4.hasNext()) {
                    C06G.A0m(arrayListA0m4, it4);
                }
                arrayListA0m3.add(new Section(connectorCatalogCategory, arrayListA0m4));
            }
            State stateCopy = stateMerge.copy(stateMerge.generation, stateMerge.connectors, new Homepage(arrayListA0m2, arrayListA0m3, connectorCatalogHomepage.customCount, j, SystemClock.elapsedRealtime()), stateMerge.pages, linkedHashMap, stateMerge.optimistic, stateMerge.staleIds);
            connectorCatalogHomepageHomepage = homepage(stateCopy);
            if (connectorCatalogHomepageHomepage == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            publish(stateCopy);
        }
        return connectorCatalogHomepageHomepage;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0, types: [com.facebook.aura.skills.repo.ConnectorCatalogCache] */
    /* JADX WARN: Type inference failed for: r9v2, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public final ConnectorCatalogPage putPage(long j, ConnectorCatalogQuery connectorCatalogQuery, String str, ConnectorCatalogPage connectorCatalogPage) {
        Page page;
        Set setA02;
        Collection collection;
        List listA0m;
        String str2;
        ConnectorCatalogPage connectorCatalogPageCopy;
        List<Section> list;
        Section next;
        AnonymousClass002.A1B(connectorCatalogQuery, 1, connectorCatalogPage);
        synchronized (this.lock) {
            State stateCurrent = current(j);
            Page page2 = stateCurrent.pages.get(connectorCatalogQuery);
            ConnectorCatalogCategory connectorCatalogCategory = null;
            if (str == null) {
                page = null;
                setA02 = A3q.A00;
            } else {
                if (page2 == null || page2.generation != j || !str.equals(page2.nextCursor)) {
                    throw new ConnectorQueryChangedException();
                }
                page = page2;
                Set set = page2.usedCursors;
                if (set == null) {
                    set = A3q.A00;
                }
                setA02 = BGK.A02(str, set);
            }
            String str3 = connectorCatalogPage.nextCursor;
            if (str3 != null && AbstractC0878AGe.A0k(setA02, str3)) {
                throw new IllegalStateException("Connector pagination repeated a cursor");
            }
            State stateMerge = merge(stateCurrent, AbstractC0878AGe.A0P(connectorCatalogPage.connectors, connectorCatalogPage.featured), true);
            if (page == null || (collection = page.ids) == null) {
                collection = C0881AGi.A00;
            }
            AHD<Skill> ahd = connectorCatalogPage.connectors;
            ArrayList arrayListA0m = AnonymousClass002.A0m(ahd);
            Iterator it = ahd.iterator();
            while (it.hasNext()) {
                C06G.A0m(arrayListA0m, it);
            }
            List listA0T = AbstractC0878AGe.A0T(AbstractC0878AGe.A0P(arrayListA0m, collection));
            if (str == null) {
                AHD<Skill> ahd2 = connectorCatalogPage.featured;
                listA0m = AnonymousClass002.A0m(ahd2);
                Iterator it2 = ahd2.iterator();
                while (it2.hasNext()) {
                    C06G.A0m(listA0m, it2);
                }
            } else if (page == null || (listA0m = page.featuredIds) == 0) {
                listA0m = C0881AGi.A00;
            }
            ConnectorCatalogCategory connectorCatalogCategory2 = connectorCatalogPage.category;
            if (connectorCatalogCategory2 == null && (page2 == null || (connectorCatalogCategory2 = page2.category) == null)) {
                Homepage homepage = stateMerge.home;
                if (homepage != null && (list = homepage.sections) != null) {
                    Iterator<Section> it3 = list.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                        Section section = next;
                        if ((connectorCatalogQuery instanceof ConnectorCatalogQuery.Category) && C7384Etj.areEqual(section.category.id, ((ConnectorCatalogQuery.Category) connectorCatalogQuery).id)) {
                            break;
                        }
                    }
                    Section section2 = next;
                    if (section2 != null) {
                        connectorCatalogCategory2 = section2.category;
                        connectorCatalogCategory = connectorCatalogCategory2;
                    }
                }
            } else {
                connectorCatalogCategory = connectorCatalogCategory2;
            }
            Page page3 = new Page(listA0T, listA0m, connectorCatalogCategory, connectorCatalogPage.nextCursor, connectorCatalogPage.totalCount, page != null ? page.firstPageFetchedAtMs : SystemClock.elapsedRealtime(), j, setA02);
            LinkedHashMap linkedHashMap = new LinkedHashMap(stateMerge.pages);
            linkedHashMap.remove(connectorCatalogQuery);
            linkedHashMap.put(connectorCatalogQuery, page3);
            boolean z = connectorCatalogQuery instanceof ConnectorCatalogQuery.Category;
            if (z) {
                str2 = ((ConnectorCatalogQuery.Category) connectorCatalogQuery).id;
            } else {
                if (!(connectorCatalogQuery instanceof ConnectorCatalogQuery.Search)) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = ((ConnectorCatalogQuery.Search) connectorCatalogQuery).categoryId;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(stateMerge.memberships);
            if (str2 != null) {
                Set setA0g = AbstractC0878AGe.A0g(AbstractC0878AGe.A0P(listA0T, listA0m));
                linkedHashMap2.remove(str2);
                Membership membership = stateMerge.memberships.get(str2);
                if (membership == null) {
                    membership = new Membership(A3q.A00, false);
                }
                linkedHashMap2.put(str2, (z && connectorCatalogPage.nextCursor == null) ? new Membership(setA0g, true) : new Membership(BGK.A01(setA0g, membership.ids), membership.complete));
            }
            State stateCopy = stateMerge.copy(stateMerge.generation, stateMerge.connectors, stateMerge.home, linkedHashMap, linkedHashMap2, stateMerge.optimistic, stateMerge.staleIds);
            if (connectorCatalogQuery.equals(new ConnectorCatalogQuery.Category("connected")) && connectorCatalogPage.nextCursor == null) {
                LinkedHashSet linkedHashSetA01 = BGK.A01(stateCopy.optimistic, AbstractC0878AGe.A0g(AbstractC0878AGe.A0P(listA0T, listA0m)));
                Map<String, Skill> map = stateCopy.connectors;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(AIW.A0H(map.size()));
                Iterator itA0n = AnonymousClass002.A0n(map);
                while (itA0n.hasNext()) {
                    Map.Entry entry = (Map.Entry) itA0n.next();
                    Object key = entry.getKey();
                    String str4 = (String) entry.getKey();
                    Skill skillCopy$default = (Skill) entry.getValue();
                    if (skillCopy$default.state == SkillState.CONNECTED && !linkedHashSetA01.contains(str4)) {
                        skillCopy$default = Skill.copy$default(skillCopy$default, null, null, null, SkillState.DISCONNECTED, false, null, false, null, false, null, 1015, null);
                    }
                    linkedHashMap3.put(key, skillCopy$default);
                }
                stateCopy = stateCopy.copy(stateCopy.generation, linkedHashMap3, stateCopy.home, stateCopy.pages, stateCopy.memberships, stateCopy.optimistic, stateCopy.staleIds);
            }
            AHD<Skill> ahd3 = connectorCatalogPage.connectors;
            ArrayList arrayListA0m2 = AnonymousClass002.A0m(ahd3);
            Iterator it4 = ahd3.iterator();
            while (it4.hasNext()) {
                C06G.A0m(arrayListA0m2, it4);
            }
            AHH<Skill> ahhResolve = resolve(stateCopy, AbstractC0878AGe.A0T(AbstractC0878AGe.A0P((connectorCatalogQuery.equals(new ConnectorCatalogQuery.Category("connected")) && str == null) ? stateCopy.optimistic : A3q.A00, arrayListA0m2)));
            AHD<Skill> ahd4 = connectorCatalogPage.featured;
            ArrayList arrayListA0m3 = AnonymousClass002.A0m(ahd4);
            Iterator it5 = ahd4.iterator();
            while (it5.hasNext()) {
                C06G.A0m(arrayListA0m3, it5);
            }
            connectorCatalogPageCopy = connectorCatalogPage.copy(connectorCatalogPage.category, resolve(stateCopy, arrayListA0m3), ahhResolve, connectorCatalogPage.nextCursor, connectorCatalogPage.totalCount);
            publish(stateCopy);
        }
        return connectorCatalogPageCopy;
    }

    public final void releaseConnector(String str) {
        C7384Etj.A0Y(str, 0);
        synchronized (this.lock) {
            Integer num = this.connectorReaders.get(str);
            int iIntValue = (num != null ? num.intValue() : 1) - 1;
            Map<String, Integer> map = this.connectorReaders;
            if (iIntValue == 0) {
                map.remove(str);
            } else {
                map.put(str, Integer.valueOf(iIntValue));
            }
            State stateA0f = AnonymousClass006.A0f(this);
            if (stateA0f != null) {
                publish(stateA0f);
            }
        }
    }

    public final void retainConnector(String str) {
        C7384Etj.A0Y(str, 0);
        synchronized (this.lock) {
            Map<String, Integer> map = this.connectorReaders;
            Integer num = map.get(str);
            map.put(str, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.AGi] */
    public final AHD<Skill> connectorsInCategory(State state, String str) {
        ?? Values;
        ?? arrayList;
        Set set;
        Set set2;
        if (state == null) {
            arrayList = C0881AGi.A00;
        } else {
            Membership membership = str != null ? state.memberships.get(str) : null;
            if ("connected".equals(str)) {
                if (membership == null || (set2 = membership.ids) == null) {
                    set2 = A3q.A00;
                }
                LinkedHashSet linkedHashSetA01 = BGK.A01(state.connectors.keySet(), set2);
                Map<String, Skill> map = state.connectors;
                Values = new ArrayList();
                Iterator it = linkedHashSetA01.iterator();
                while (it.hasNext()) {
                    Skill skill = map.get(it.next());
                    if (skill != null) {
                        Values.add(skill);
                    }
                }
            } else {
                Values = state.connectors.values();
            }
            arrayList = new ArrayList();
            for (Object obj : Values) {
                Skill skill2 = (Skill) obj;
                if (str != null) {
                    if (!str.equals("connected")) {
                        if (str.equals(ConnectorCatalogKt.CUSTOM_CATEGORY_ID)) {
                            if (skill2.isCustom) {
                                if (membership != null && membership.complete) {
                                    set = membership.ids;
                                }
                            }
                        } else if (membership == null || (set = membership.ids) == null) {
                            set = A3q.A00;
                        }
                        if (set.contains(skill2.id)) {
                        }
                    } else if (skill2.state == SkillState.CONNECTED) {
                    }
                }
                arrayList.add(obj);
            }
        }
        return AGI.A0C(arrayList);
    }

    public static /* synthetic */ boolean hasFreshPage$default(ConnectorCatalogCache connectorCatalogCache, ConnectorCatalogQuery connectorCatalogQuery, boolean z, Long l, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        return connectorCatalogCache.hasFreshPage(connectorCatalogQuery, z, l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConnectorCatalogHomepage homepage(State state) {
        Homepage homepage = state.home;
        if (homepage == null) {
            return null;
        }
        AHH<Skill> ahhResolve = resolve(state, homepage.featuredIds);
        List<Section> list = homepage.sections;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (Section section : list) {
            arrayListA0i.add(new ConnectorCatalogSection(section.category, resolve(state, section.ids)));
        }
        return new ConnectorCatalogHomepage(ahhResolve, AGI.A0C(arrayListA0i), homepage.customCount);
    }

    public static /* synthetic */ Long invalidate$default(ConnectorCatalogCache connectorCatalogCache, String str, SkillState skillState, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            skillState = null;
        }
        return connectorCatalogCache.invalidate(str, skillState, AnonymousClass005.A1O(i, z));
    }

    private final State merge(State state, List<Skill> list, boolean z) {
        Set setA0f = AbstractC0878AGe.A0f(state.optimistic);
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        for (Skill skillCopy$default : list) {
            if (z && skillCopy$default.state == SkillState.CONNECTED) {
                setA0f.remove(skillCopy$default.id);
            }
            if (setA0f.contains(skillCopy$default.id)) {
                skillCopy$default = Skill.copy$default(skillCopy$default, null, null, null, SkillState.CONNECTED, false, null, false, null, false, null, 1015, null);
            }
            arrayListA0m.add(skillCopy$default);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(state.connectors);
        for (Skill skill : this.icons.reconcile(arrayListA0m)) {
            linkedHashMap.remove(skill.id);
            linkedHashMap.put(skill.id, skill);
        }
        Set<String> setA0g = AbstractC0878AGe.A0g(setA0f);
        Set<String> set = state.staleIds;
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list);
        Iterator<Skill> it = list.iterator();
        while (it.hasNext()) {
            C06G.A0m(arrayListA0m2, it);
        }
        return state.copy(state.generation, linkedHashMap, state.home, state.pages, state.memberships, setA0g, BGK.A03(AbstractC0878AGe.A0g(arrayListA0m2), set));
    }

    public static /* synthetic */ State merge$default(ConnectorCatalogCache connectorCatalogCache, State state, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return connectorCatalogCache.merge(state, list, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ConnectorCatalogPage page(State state, ConnectorCatalogQuery connectorCatalogQuery) {
        Page page = state.pages.get(connectorCatalogQuery);
        if (page == null) {
            return null;
        }
        boolean zAreEqual = C7384Etj.areEqual(connectorCatalogQuery, new ConnectorCatalogQuery.Category("connected"));
        List<String> listA0T = page.ids;
        if (zAreEqual) {
            listA0T = AbstractC0878AGe.A0T(AbstractC0878AGe.A0P(state.optimistic, listA0T));
        }
        ConnectorCatalogCategory connectorCatalogCategory = page.category;
        AHH<Skill> ahhResolve = resolve(state, page.featuredIds);
        AHH<Skill> ahhResolve2 = resolve(state, listA0T);
        if (C7384Etj.areEqual(connectorCatalogQuery, new ConnectorCatalogQuery.Category("connected"))) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : ahhResolve2) {
                if (((Skill) obj).state == SkillState.CONNECTED) {
                    arrayList.add(obj);
                }
            }
            ahhResolve2 = AGI.A0C(arrayList);
        }
        return new ConnectorCatalogPage(connectorCatalogCategory, ahhResolve, ahhResolve2, page.nextCursor, page.totalCount);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r1 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        r15.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d8, code lost:
    
        if (r1 == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01da, code lost:
    
        r3.remove(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void publish(com.facebook.aura.skills.repo.ConnectorCatalogCache.State r18) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.skills.repo.ConnectorCatalogCache.publish(com.facebook.aura.skills.repo.ConnectorCatalogCache$State):void");
    }

    private final AHH<Skill> resolve(State state, List<String> list) {
        Map<String, Skill> map = state.connectors;
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            Skill skill = map.get(it.next());
            if (skill != null) {
                arrayList.add(skill);
            }
        }
        return AGI.A0C(arrayList);
    }

    public final void clear() {
        synchronized (this.lock) {
            this.state.Af8(null);
            this.readers.clear();
            this.connectorReaders.clear();
            this.icons.clear();
        }
    }

    public final Long invalidate(String str, SkillState skillState, boolean z) {
        Long lValueOf;
        synchronized (this.lock) {
            State value = this.state.getValue();
            if (value == null) {
                lValueOf = null;
            } else {
                State stateCopy = value.copy(value.generation + 1, value.connectors, value.home, value.pages, value.memberships, value.optimistic, BGK.A01(str == null ? value.connectors.keySet() : Collections.singleton(str), value.staleIds));
                if (str != null) {
                    stateCopy = stateCopy.copy(stateCopy.generation, stateCopy.connectors, stateCopy.home, stateCopy.pages, stateCopy.memberships, z ? BGK.A02(str, stateCopy.optimistic) : skillState == SkillState.DISCONNECTED ? BGK.A04(str, stateCopy.optimistic) : stateCopy.optimistic, stateCopy.staleIds);
                    Skill skill = stateCopy.connectors.get(str);
                    if (skill != null && skillState != null) {
                        stateCopy = updateConnectedMembership(merge(stateCopy, Collections.singletonList(Skill.copy$default(skill, null, null, null, skillState, false, null, false, null, false, null, 1015, null)), !z), str);
                    }
                }
                publish(stateCopy);
                lValueOf = Long.valueOf(stateCopy.generation);
            }
        }
        return lValueOf;
    }

    public final C20Q<AHD<Skill>> observeConnectors(String str) {
        return GDB.A01(new ConnectorCatalogCache$observeConnectors$$inlined$map$1(this.state, this, str));
    }

    public final C20Q<ConnectorCatalogHomepage> observeHomepage() {
        return GDB.A01(new ConnectorCatalogCache$observeHomepage$$inlined$map$1(this.state, this));
    }

    public final void release(ConnectorCatalogQuery connectorCatalogQuery) {
        synchronized (this.lock) {
            Integer num = this.readers.get(connectorCatalogQuery);
            int iIntValue = (num != null ? num.intValue() : 1) - 1;
            Map<ConnectorCatalogQuery, Integer> map = this.readers;
            if (iIntValue == 0) {
                map.remove(connectorCatalogQuery);
            } else {
                map.put(connectorCatalogQuery, Integer.valueOf(iIntValue));
            }
            State stateA0f = AnonymousClass006.A0f(this);
            if (stateA0f != null) {
                publish(stateA0f);
            }
        }
    }

    public final void retain(ConnectorCatalogQuery connectorCatalogQuery) {
        synchronized (this.lock) {
            Map<ConnectorCatalogQuery, Integer> map = this.readers;
            Integer num = map.get(connectorCatalogQuery);
            map.put(connectorCatalogQuery, Integer.valueOf((num != null ? num.intValue() : 0) + 1));
        }
    }

    public final List<String> staleObservedConnectorIds() {
        ArrayList arrayList;
        synchronized (this.lock) {
            Set<String> setKeySet = this.connectorReaders.keySet();
            arrayList = new ArrayList();
            for (String str : setKeySet) {
                if (isConnectorStale(str)) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectorCatalogCache() {
        long j = 0;
        this.state = new C9286GCn(new State(j, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0));
    }

    private final State current(long j) {
        State stateA0f = AnonymousClass006.A0f(this);
        if (stateA0f == null) {
            throw new CancellationException("Connector session ended");
        }
        if (stateA0f.generation == j) {
            return stateA0f;
        }
        throw new ConnectorCatalogInvalidatedException();
    }

    public final AHD<Skill> connectors(String str) {
        return connectorsInCategory(AnonymousClass006.A0f(this), str);
    }

    public final Long getGeneration() {
        State stateA0f = AnonymousClass006.A0f(this);
        if (stateA0f != null) {
            return Long.valueOf(stateA0f.generation);
        }
        return null;
    }

    public final ConnectorCatalogHomepage getHomepage() {
        State stateA0f = AnonymousClass006.A0f(this);
        if (stateA0f != null) {
            return homepage(stateA0f);
        }
        return null;
    }

    public final boolean hasFreshHomepage(long j) {
        Homepage homepage;
        State stateA0f = AnonymousClass006.A0f(this);
        return stateA0f != null && (homepage = stateA0f.home) != null && homepage.generation == stateA0f.generation && SystemClock.elapsedRealtime() - homepage.fetchedAtMs < j;
    }

    public final ConnectorCatalogPage page(ConnectorCatalogQuery connectorCatalogQuery) {
        C7384Etj.A0Y(connectorCatalogQuery, 0);
        State stateA0f = AnonymousClass006.A0f(this);
        if (stateA0f != null) {
            return page(stateA0f, connectorCatalogQuery);
        }
        return null;
    }
}
