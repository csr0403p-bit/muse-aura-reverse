package com.facebook.aura.pairs;

import X.AGI;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C0881AGi;
import X.C3cG;
import X.C60O;
import X.C60R;
import X.C7384Etj;
import X.G2j;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.pairs.ConnectionsUiState;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsViewModel$addSuggestions$1", f = "ConnectionsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class ConnectionsViewModel$addSuggestions$1 extends AbstractC07127nr implements G2j<ConnectionsUiState, String, SearchResults, HtJ<? super AHD<? extends PairsSuggestion>>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public /* synthetic */ Object L$2;
    public int label;

    public ConnectionsViewModel$addSuggestions$1(HtJ<? super ConnectionsViewModel$addSuggestions$1> htJ) {
        super(4, htJ);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(ConnectionsUiState connectionsUiState, String str, SearchResults searchResults, HtJ<? super AHD<PairsSuggestion>> htJ) {
        ConnectionsViewModel$addSuggestions$1 connectionsViewModel$addSuggestions$1 = new ConnectionsViewModel$addSuggestions$1(htJ);
        connectionsViewModel$addSuggestions$1.L$0 = connectionsUiState;
        connectionsViewModel$addSuggestions$1.L$1 = str;
        connectionsViewModel$addSuggestions$1.L$2 = searchResults;
        return connectionsViewModel$addSuggestions$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Iterable iterable;
        ConnectionsUiState.Loaded loaded;
        ConnectionsUiState connectionsUiState = (ConnectionsUiState) this.L$0;
        String str = (String) this.L$1;
        SearchResults searchResults = (SearchResults) this.L$2;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (!(connectionsUiState instanceof ConnectionsUiState.Loaded) || (loaded = (ConnectionsUiState.Loaded) connectionsUiState) == null || (iterable = loaded.suggestions) == null) {
            iterable = C0881AGi.A00;
        }
        List<String> listSearchTerms = ConnectionsViewModelKt.searchTerms(str);
        HashSet hashSetA13 = C60O.A13();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            hashSetA13.add(((PairsSuggestion) it.next()).id);
        }
        List list = searchResults.people;
        if (!C7384Etj.areEqual(searchResults.query, AnonymousClass002.A0l(str)) || list == null) {
            list = C0881AGi.A00;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj2 : list) {
            C60R.A1I(((PairsSuggestion) obj2).id, obj2, hashSetA13, arrayListA0h);
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (Object obj3 : iterable) {
            if (ConnectionsViewModelKt.matches((PairsSuggestion) obj3, listSearchTerms)) {
                arrayListA0h2.add(obj3);
            }
        }
        return AGI.A07(AbstractC0878AGe.A0P(arrayListA0h, arrayListA0h2));
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Object invoke(ConnectionsUiState connectionsUiState, String str, SearchResults searchResults, HtJ<? super AHD<? extends PairsSuggestion>> htJ) {
        return invoke2(connectionsUiState, str, searchResults, (HtJ<? super AHD<PairsSuggestion>>) htJ);
    }
}
