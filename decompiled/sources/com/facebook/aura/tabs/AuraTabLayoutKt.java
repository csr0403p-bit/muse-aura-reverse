package com.facebook.aura.tabs;

import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BFM;
import X.C0881AGi;
import X.C1BO;
import X.C2CK;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C7BY;
import X.G0V;
import com.facebook.aura.common.prefs.HatchDeveloperPrefs;
import com.facebook.aura.library.repo.ArtifactItem;
import com.facebook.aura.library.repo.ArtifactOpenTarget;
import com.facebook.aura.library.repo.ArtifactSource;
import com.facebook.aura.library.repo.ArtifactsDataSource;
import com.facebook.aura.library.repo.UnifiedArtifactKt;
import com.facebook.aura.navigation.key.PeerSpaceScreenKey;
import com.facebook.aura.navigation.key.SpaceNavigationIdKt;
import com.facebook.aura.spaces.repo.PinnedItemsRepository;
import com.facebook.aura.tabs.AuraTabItem;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.aura.utils.HatchUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class AuraTabLayoutKt {
    public static final int MAX_TAB_COUNT = 5;

    public static final int coerceRequestedNavbarCount(Integer num, int i, int i2) {
        if (i <= 0) {
            return 0;
        }
        if (num == null) {
            return i2;
        }
        int iIntValue = num.intValue();
        if (iIntValue < 0) {
            return 0;
        }
        return iIntValue > i ? i : iIntValue;
    }

    public static final boolean rememberShouldShowAuraTabBar(BFM bfm, int i) {
        AHD<AuraTabItem> ahd = rememberAuraTabLayout(false, bfm, 0, 1).tabs;
        if (!(ahd instanceof Collection) || !ahd.isEmpty()) {
            for (AuraTabItem auraTabItem : ahd) {
                if (!(auraTabItem instanceof AuraTabItem.Fixed) || ((AuraTabItem.Fixed) auraTabItem).tab != FixedTab.CHAT) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final PeerSpaceScreenKey toPeerSpaceScreenKey(ArtifactItem artifactItem) {
        ArtifactOpenTarget.PeerSpace peerSpacePeerSpaceTargetFromItemKey;
        C7384Etj.A0Y(artifactItem, 0);
        if (artifactItem.source != ArtifactSource.PEER_SPACE || (peerSpacePeerSpaceTargetFromItemKey = UnifiedArtifactKt.peerSpaceTargetFromItemKey(artifactItem.itemKey)) == null) {
            return null;
        }
        return new PeerSpaceScreenKey(peerSpacePeerSpaceTargetFromItemKey.hostMuse, peerSpacePeerSpaceTargetFromItemKey.spaceId, artifactItem.displayName, null, true);
    }

    public static final AuraTabLayout rememberAuraTabLayout(boolean z, BFM bfm, int i, int i2) {
        boolean z2 = z;
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        AbstractC3358CGz abstractC3358CGzA0g = AnonymousClass002.A0g(bfm);
        boolean zA65 = bfm.A65(abstractC3358CGzA0g);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = AnonymousClass003.A0a(bfm, abstractC3358CGzA0g);
        }
        ArtifactsDataSource artifactsDataSource = (ArtifactsDataSource) objAaT;
        C1BO c1boA02 = C2CK.A02(bfm, artifactsDataSource.items);
        C1BO c1boA022 = C2CK.A02(bfm, artifactsDataSource.hasLoaded);
        boolean zA652 = bfm.A65(abstractC3358CGzA0g);
        Object objAaT2 = bfm.AaT();
        if (zA652 || objAaT2 == C78N.A00) {
            objAaT2 = PinnedItemsRepository.Companion.getInstance(abstractC3358CGzA0g);
            bfm.Ai0(objAaT2);
        }
        PinnedItemsRepository pinnedItemsRepository = (PinnedItemsRepository) objAaT2;
        C1BO c1boA023 = C2CK.A02(bfm, pinnedItemsRepository.navigationOrder);
        C1BO c1boA024 = C2CK.A02(bfm, pinnedItemsRepository.navigationNavbarCount);
        HatchUtils hatchUtils = HatchUtils.INSTANCE;
        boolean zIsTabSortingEnabled = hatchUtils.isTabSortingEnabled();
        boolean zIsSidePanelSpacesEnabled = hatchUtils.isSidePanelSpacesEnabled();
        boolean z3 = true;
        C1BO c1boA025 = C2CK.A02(bfm, HatchDeveloperPrefs.tabOrder);
        HatchUtil hatchUtil = HatchUtil.INSTANCE;
        boolean zIsFeedEnabled = hatchUtil.isFeedEnabled();
        boolean zIsConnectionsTabEnabled = hatchUtil.isConnectionsTabEnabled();
        Object value = c1boA02.getValue();
        boolean zA0F = C1BO.A0F(c1boA022);
        Object value2 = c1boA025.getValue();
        Object value3 = c1boA024.getValue();
        boolean zA1W = AnonymousClass002.A1W(bfm, c1boA023.getValue(), bfm.A65(value3), AnonymousClass003.A1U(bfm, zIsTabSortingEnabled, AnonymousClass004.A1W(bfm, value2, zIsConnectionsTabEnabled, AnonymousClass003.A1U(bfm, zA0F, bfm.A65(value), zIsFeedEnabled)), zIsSidePanelSpacesEnabled));
        Object objAaT3 = bfm.AaT();
        if (zA1W || objAaT3 == C78N.A00) {
            objAaT3 = resolveAuraTabLayout((List) c1boA02.getValue(), C1BO.A0F(c1boA022), zIsFeedEnabled, zIsConnectionsTabEnabled, (List) c1boA025.getValue(), zIsTabSortingEnabled, zIsSidePanelSpacesEnabled, (Integer) c1boA024.getValue(), (List) c1boA023.getValue());
            bfm.Ai0(objAaT3);
        }
        AuraTabLayout auraTabLayout = (AuraTabLayout) objAaT3;
        AHD<AuraTabItem> ahd = auraTabLayout.items;
        ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(((AuraTabItem) it.next()).getId());
        }
        Object[] objArr = {Boolean.valueOf(z2), Boolean.valueOf(zIsTabSortingEnabled), Boolean.valueOf(zIsSidePanelSpacesEnabled), Boolean.valueOf(C1BO.A0F(c1boA022)), arrayListA0i, c1boA023.getValue()};
        if ((((i & 14) ^ 6) <= 4 || !bfm.A66(z2)) && (i & 6) != 4) {
            z3 = false;
        }
        boolean zA1T = AnonymousClass001.A1T(bfm, pinnedItemsRepository, AnonymousClass005.A1U(bfm, c1boA022, arrayListA0i, c1boA023, AnonymousClass003.A1U(bfm, zIsTabSortingEnabled, z3, zIsSidePanelSpacesEnabled)));
        Object objAaT4 = bfm.AaT();
        if (zA1T || objAaT4 == C78N.A00) {
            objAaT4 = new AuraTabLayoutKt$rememberAuraTabLayout$1$1(z2, zIsTabSortingEnabled, zIsSidePanelSpacesEnabled, arrayListA0i, pinnedItemsRepository, c1boA022, c1boA023, null);
            bfm.Ai0(objAaT4);
        }
        C78e.A08(bfm, (G0V) objAaT4, objArr);
        return auraTabLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.AGi] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.Collection] */
    public static final AuraTabLayout resolveAuraTabLayout(List<ArtifactItem> list, boolean z, boolean z2, boolean z3, List<String> list2, boolean z4, boolean z5, Integer num, List<String> list3) {
        ?? arrayList;
        ?? arrayList2;
        List<String> listRestoreMissingDefaultTabs;
        String strA0K;
        ArtifactSource artifactSource;
        List<FixedTab> listEnabledFixedTabs = AuraFixedNavBarKt.enabledFixedTabs(z2, z3);
        ArrayList arrayListA0m = AnonymousClass002.A0m(listEnabledFixedTabs);
        Iterator<FixedTab> it = listEnabledFixedTabs.iterator();
        while (it.hasNext()) {
            arrayListA0m.add(new AuraTabItem.Fixed(it.next()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayListA0m) {
            if (((AuraTabItem.Fixed) obj).tab == FixedTab.CONNECTIONS) {
                arrayList3.add(obj);
            }
        }
        List listA00 = A00(arrayListA0m, AbstractC0878AGe.A0g(arrayList3));
        int iMin = Math.min(arrayListA0m.size(), 5);
        ArrayList arrayList4 = new ArrayList();
        for (ArtifactItem artifactItem : list) {
            ArtifactItem artifactItem2 = artifactItem;
            if (z5 && ((artifactSource = artifactItem2.source) == ArtifactSource.SPACE || artifactSource == ArtifactSource.SAVED_SPACE || artifactSource == ArtifactSource.PEER_SPACE)) {
                arrayList4.add(artifactItem);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : arrayList4) {
            if (hashSet.add(((ArtifactItem) obj2).itemKey)) {
                arrayList5.add(obj2);
            }
        }
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(arrayList5);
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            arrayListA0m2.add(new AuraTabItem.Space((ArtifactItem) it2.next(), false));
        }
        if (!z4 && !z5) {
            return new AuraTabLayout(AGI.A07(AbstractC0878AGe.A0P(arrayListA0m2, AbstractC0878AGe.A0P(arrayList3, listA00))), listA00.size(), listA00.size(), false, false);
        }
        if (z || !z5) {
            arrayList = C0881AGi.A00;
        } else {
            arrayList = new ArrayList();
            for (String str : list3) {
                C7384Etj.A0Y(str, 0);
                if (str.startsWith(SpaceNavigationIdKt.SPACE_NAVIGATION_ID_PREFIX) && (strA0K = C7BY.A0K(SpaceNavigationIdKt.SPACE_NAVIGATION_ID_PREFIX, str)) != null && !C7BY.A0j(strA0K)) {
                    arrayList.add(new AuraTabItem.Space(new ArtifactItem(UnifiedArtifactKt.peerSpaceTargetFromItemKey(strA0K) != null ? ArtifactSource.PEER_SPACE : ArtifactSource.SPACE, strA0K, "", null, null, false, null, null, null, null, null, null, null, null, null, null, null), true));
                }
            }
        }
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(arrayList, arrayListA0m2);
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList6 = new ArrayList();
        Iterator it3 = arrayListA0P.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (hashSet2.add(((AuraTabItem) next).getId())) {
                arrayList6.add(next);
            }
        }
        ArrayList arrayListA0P2 = AbstractC0878AGe.A0P(arrayList3, AbstractC0878AGe.A0P(arrayList6, listA00));
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass005.A0C(arrayListA0P2));
        Iterator it4 = arrayListA0P2.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            linkedHashMap.put(((AuraTabItem) next2).getId(), next2);
        }
        ArrayList arrayListA0m3 = AnonymousClass002.A0m(listA00);
        Iterator it5 = listA00.iterator();
        while (it5.hasNext()) {
            arrayListA0m3.add(((AuraTabItem) it5.next()).getId());
        }
        ArrayList arrayList7 = new ArrayList();
        for (String str2 : list2) {
            Iterator<FixedTab> it6 = FixedTab.getEntries().iterator();
            while (true) {
                if (it6.hasNext()) {
                    FixedTab next3 = it6.next();
                    if (next3.name().equals(str2)) {
                        if (next3 != null) {
                            arrayList7.add(next3);
                        }
                    }
                }
            }
        }
        ArrayList arrayListA0m4 = AnonymousClass002.A0m(arrayList7);
        Iterator it7 = arrayList7.iterator();
        while (it7.hasNext()) {
            arrayListA0m4.add(((FixedTab) it7.next()).getNavigationId());
        }
        List<String> list4 = arrayListA0m4;
        if (!list3.isEmpty()) {
            list4 = list3;
        }
        if (!z4) {
            arrayList2 = listA00;
        } else {
            if (z5) {
                int size = listA00.size();
                if (size > iMin) {
                    size = iMin;
                }
                int iCoerceRequestedNavbarCount = coerceRequestedNavbarCount(num, iMin, size);
                FixedTab fixedTab = FixedTab.CHAT;
                List listSingletonList = Collections.singletonList(fixedTab.getNavigationId());
                ArrayList arrayList8 = new ArrayList();
                for (String str3 : list4) {
                    if (!C7384Etj.areEqual(str3, fixedTab.getNavigationId())) {
                        arrayList8.add(str3);
                    }
                }
                List listA0T = AbstractC0878AGe.A0T(AbstractC0878AGe.A0P(arrayList8, listSingletonList));
                List listA0a = AbstractC0878AGe.A0a(listA0T, iCoerceRequestedNavbarCount);
                ArrayList arrayList9 = new ArrayList();
                for (Object obj3 : listA0a) {
                    if (linkedHashMap.containsKey(obj3)) {
                        arrayList9.add(obj3);
                    }
                }
                if (num == null) {
                    listRestoreMissingDefaultTabs = restoreMissingDefaultTabs(arrayList9, arrayListA0m3, iCoerceRequestedNavbarCount);
                } else {
                    ArrayList arrayList10 = new ArrayList();
                    for (Object obj4 : arrayListA0m3) {
                        if (!listA0T.contains(obj4)) {
                            arrayList10.add(obj4);
                        }
                    }
                    listRestoreMissingDefaultTabs = restoreMissingDefaultTabs(arrayList9, arrayList10, iCoerceRequestedNavbarCount);
                }
                ArrayList arrayListA0m5 = AnonymousClass002.A0m(arrayList3);
                Iterator it8 = arrayList3.iterator();
                while (it8.hasNext()) {
                    arrayListA0m5.add(((AuraTabItem) it8.next()).getId());
                }
                ArrayList arrayList11 = new ArrayList();
                for (Object obj5 : arrayListA0m5) {
                    if (!listA0T.contains(obj5)) {
                        arrayList11.add(obj5);
                    }
                }
                ArrayList arrayList12 = new ArrayList();
                for (Object obj6 : listA0T) {
                    if (linkedHashMap.containsKey(obj6) && !listRestoreMissingDefaultTabs.contains(obj6)) {
                        arrayList12.add(obj6);
                    }
                }
                ArrayList arrayListA0P3 = AbstractC0878AGe.A0P(arrayList12, listRestoreMissingDefaultTabs);
                ArrayList arrayListA0m6 = AnonymousClass002.A0m(arrayListA0P2);
                Iterator it9 = arrayListA0P2.iterator();
                while (it9.hasNext()) {
                    arrayListA0m6.add(((AuraTabItem) it9.next()).getId());
                }
                List listA002 = A00(AbstractC0878AGe.A0T(AbstractC0878AGe.A0P(arrayListA0m6, arrayListA0P3)), AbstractC0878AGe.A0g(arrayList11));
                ArrayList arrayListA0P4 = AbstractC0878AGe.A0P(AbstractC0878AGe.A0Z(listA002, iCoerceRequestedNavbarCount), AbstractC0878AGe.A0P(arrayList11, AbstractC0878AGe.A0a(listA002, iCoerceRequestedNavbarCount)));
                ArrayList arrayList13 = new ArrayList();
                Iterator it10 = arrayListA0P4.iterator();
                while (it10.hasNext()) {
                    Object obj7 = linkedHashMap.get(it10.next());
                    if (obj7 != null) {
                        arrayList13.add(obj7);
                    }
                }
                return new AuraTabLayout(AGI.A07(arrayList13), iCoerceRequestedNavbarCount, iMin, true, z5);
            }
            List listA0T2 = AbstractC0878AGe.A0T(AbstractC0878AGe.A0P(arrayListA0m3, AbstractC0878AGe.A0P(list4, Collections.singletonList(FixedTab.CHAT.getNavigationId()))));
            arrayList2 = new ArrayList();
            for (Object obj8 : listA0T2) {
                Iterator it11 = listA00.iterator();
                while (true) {
                    if (it11.hasNext()) {
                        Object next4 = it11.next();
                        if (C7384Etj.areEqual(((AuraTabItem.Fixed) next4).getId(), obj8)) {
                            if (next4 != null) {
                                arrayList2.add(next4);
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayListA0m7 = AnonymousClass002.A0m(arrayList6);
        Iterator it12 = arrayList6.iterator();
        while (it12.hasNext()) {
            arrayListA0m7.add(((AuraTabItem) it12.next()).getId());
        }
        List listA0T3 = AbstractC0878AGe.A0T(AbstractC0878AGe.A0P(arrayListA0m7, list3));
        ArrayList arrayList14 = new ArrayList();
        for (Object obj9 : listA0T3) {
            Iterator it13 = arrayList6.iterator();
            while (true) {
                if (it13.hasNext()) {
                    Object next5 = it13.next();
                    if (C7384Etj.areEqual(((AuraTabItem.Space) next5).getId(), obj9)) {
                        if (next5 != null) {
                            arrayList14.add(next5);
                        }
                    }
                }
            }
        }
        AHD ahdA07 = AGI.A07(AbstractC0878AGe.A0P(arrayList14, AbstractC0878AGe.A0P(arrayList3, arrayList2)));
        int size2 = listA00.size();
        return new AuraTabLayout(ahdA07, size2, size2, z4, z5);
    }

    public static final <T> List<T> A00(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        AnonymousClass003.A0u(iterable, iterable2);
        if (!(iterable2 instanceof Collection)) {
            iterable2 = AbstractC0878AGe.A0X(iterable2);
        }
        Collection collection = (Collection) iterable2;
        if (collection.isEmpty()) {
            return AbstractC0878AGe.A0X(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t : iterable) {
            if (!collection.contains(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final List<String> auraTabBarIds(AbstractC3358CGz abstractC3358CGz, List<String> list) {
        AnonymousClass003.A0u(abstractC3358CGz, list);
        ArtifactsDataSource companion = ArtifactsDataSource.Companion.getInstance(abstractC3358CGz);
        PinnedItemsRepository companion2 = PinnedItemsRepository.Companion.getInstance(abstractC3358CGz);
        AHD<ArtifactItem> value = companion.items.getValue();
        boolean zA1X = AnonymousClass001.A1X(companion.hasLoaded.getValue());
        HatchUtil hatchUtil = HatchUtil.INSTANCE;
        boolean zIsFeedEnabled = hatchUtil.isFeedEnabled();
        boolean zIsConnectionsTabEnabled = hatchUtil.isConnectionsTabEnabled();
        List<String> value2 = HatchDeveloperPrefs.tabOrder.getValue();
        HatchUtils hatchUtils = HatchUtils.INSTANCE;
        AHD<AuraTabItem> ahd = resolveAuraTabLayout(value, zA1X, zIsFeedEnabled, zIsConnectionsTabEnabled, value2, hatchUtils.isTabSortingEnabled(), hatchUtils.isSidePanelSpacesEnabled(), companion2.navigationNavbarCount.getValue(), list).tabs;
        ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            AnonymousClass007.A1A(arrayListA0i, it);
        }
        return arrayListA0i;
    }

    public static final List<String> restoreMissingDefaultTabs(List<String> list, List<String> list2, int i) {
        int iNextIndex;
        ArrayList arrayListA0R = AbstractC0878AGe.A0R(list);
        ArrayList arrayList = new ArrayList();
        for (String str : list2) {
            if (!arrayListA0R.contains(str)) {
                arrayList.add(str);
            }
        }
        for (Object obj : arrayList) {
            if (arrayListA0R.size() < i) {
                int iIndexOf = list2.indexOf(obj);
                Iterator it = arrayListA0R.iterator();
                int i2 = 0;
                while (true) {
                    iNextIndex = -1;
                    if (!it.hasNext()) {
                        break;
                    }
                    if (list2.indexOf(it.next()) > iIndexOf) {
                        if (i2 < 0) {
                            break;
                        }
                    } else {
                        i2++;
                    }
                }
                ListIterator listIterator = arrayListA0R.listIterator(arrayListA0R.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    int iIndexOf2 = list2.indexOf(listIterator.previous());
                    if (iIndexOf2 >= 0 && iIndexOf2 < iIndexOf) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                i2 = iNextIndex + 1;
                arrayListA0R.add(i2, obj);
            }
        }
        return arrayListA0R;
    }
}
