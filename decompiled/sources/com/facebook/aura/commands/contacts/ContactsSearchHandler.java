package com.facebook.aura.commands.contacts;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass007;
import X.C2nw;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C60O;
import X.C7pd;
import X.C7qW;
import X.C9oY;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.HzP;
import android.content.Context;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandResponse;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.core.NodeExecutionContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public final class ContactsSearchHandler implements HatchNodeCommandHandler {
    public static final ContactsSearchHandler INSTANCE = new ContactsSearchHandler();

    public final class SearchOutcome {
        public final List<CanonicalContact> contacts;
        public final int nameMatchTotal;
        public final List<CanonicalContact> nameMatches;

        public final List<CanonicalContact> getContacts() {
            return this.contacts;
        }

        public final int getNameMatchTotal() {
            return this.nameMatchTotal;
        }

        public final List<CanonicalContact> getNameMatches() {
            return this.nameMatches;
        }

        public SearchOutcome(List<CanonicalContact> list, List<CanonicalContact> list2, int i) {
            AnonymousClass003.A0u(list, list2);
            this.contacts = list;
            this.nameMatches = list2;
            this.nameMatchTotal = i;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.contacts.ContactsSearchHandler$execute$2", f = "ContactsSearchHandler.kt", l = {88, 97, 107, 116, 122, 123, 134}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.contacts.ContactsSearchHandler$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NodeCommandResponse>, Object> {
        public final /* synthetic */ HatchNodeCommandContext $commandContext;
        public final /* synthetic */ NodeExecutionContext $ctx;
        public final /* synthetic */ String $paramsJson;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchNodeCommandContext hatchNodeCommandContext, String str, NodeExecutionContext nodeExecutionContext, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$commandContext = hatchNodeCommandContext;
            this.$paramsJson = str;
            this.$ctx = nodeExecutionContext;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$commandContext, this.$paramsJson, this.$ctx, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ca A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x010e A[RETURN] */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v13, types: [kotlinx.serialization.json.JsonObject] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.contacts.ContactsSearchHandler.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super NodeCommandResponse> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.contacts.ContactsSearchHandler", f = "ContactsSearchHandler.kt", l = {HatchVoiceAnnouncementSheetKt.NUX_FADE_IN_DELAY_MS}, m = AuraDeeplinkRouteMapper.SEARCH_ROUTE, v = 2)
    /* renamed from: com.facebook.aura.commands.contacts.ContactsSearchHandler$search$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ContactsSearchHandler.this.search(null, null, this);
        }
    }

    private final String personKey(CanonicalContact canonicalContact) {
        List<ContactPhone> list = canonicalContact.phones;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<ContactPhone> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next().value;
            StringBuilder sbA0w = C60O.A0w();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (Character.isDigit(cCharAt)) {
                    sbA0w.append(cCharAt);
                }
            }
            arrayListA0i.add(sbA0w.toString());
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it2 = arrayListA0i.iterator();
        while (it2.hasNext()) {
            AnonymousClass007.A19(arrayListA0h, it2);
        }
        return FGI.A0U(C3cJ.A0J(canonicalContact.displayName), "|", C3cH.A0e(",", AbstractC0878AGe.A0W(C3cG.A0m(arrayListA0h))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (r0 == r5) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00e4 -> B:11:0x003d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object search(android.content.Context r17, java.lang.String r18, X.HtJ<? super com.facebook.aura.commands.contacts.ContactsSearchHandler.SearchOutcome> r19) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.contacts.ContactsSearchHandler.search(android.content.Context, java.lang.String, X.HtJ):java.lang.Object");
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.CONTACTS_SEARCH;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public HatchNodeCommandHandler getHandler() {
        return this;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean getOnlySendsCard() {
        return false;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandSpec getSpec() {
        return ContactsCommandSpecs.CONTACTS_SEARCH;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean isEnabled() {
        return true;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ String validateParams(String str) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonObject buildResultPayload(String str, SearchOutcome searchOutcome) {
        C2nw c2nwA02 = C7qW.A02();
        C7qW.A0C(c2nwA02);
        if (searchOutcome.nameMatchTotal > 1) {
            C7qW.A04(true, "requiresUserChoice", c2nwA02);
            C7qW.A06("nameMatchQuery", str, c2nwA02);
            C7pd c7pdA01 = C7pd.A01();
            Iterator<CanonicalContact> it = searchOutcome.nameMatches.iterator();
            while (it.hasNext()) {
                C7pd.A04(it, c7pdA01);
            }
            c2nwA02.A01("nameMatches", C7pd.A00(c7pdA01));
            if (searchOutcome.nameMatchTotal > searchOutcome.nameMatches.size()) {
                C7qW.A04(true, "nameMatchesTruncated", c2nwA02);
                C7qW.A05(Integer.valueOf(searchOutcome.nameMatchTotal), "nameMatchTotal", c2nwA02);
            }
        }
        C7pd c7pdA012 = C7pd.A01();
        Iterator<CanonicalContact> it2 = searchOutcome.contacts.iterator();
        while (it2.hasNext()) {
            C7pd.A04(it2, c7pdA012);
        }
        return C60O.A1I(HatchNodeCardJsonKt.TYPE_CONTACTS, C7pd.A00(c7pdA012), c2nwA02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String stringParam(JsonObject jsonObject, String str) {
        JsonPrimitive jsonPrimitive;
        String strA04;
        Object obj = jsonObject.get(str);
        if (!(obj instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj) == null || (strA04 = C9oY.A04(jsonPrimitive)) == null || strA04.length() <= 0) {
            return null;
        }
        return strA04;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public Object execute(AbstractC3358CGz abstractC3358CGz, HatchNodeCommandContext hatchNodeCommandContext, String str, NodeExecutionContext nodeExecutionContext, HtJ<? super NodeCommandResponse> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(hatchNodeCommandContext, str, nodeExecutionContext, null));
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ Object optionalDevicePermissions(String str, Context context, HtJ<? super List<String>> htJ) {
        return null;
    }
}
