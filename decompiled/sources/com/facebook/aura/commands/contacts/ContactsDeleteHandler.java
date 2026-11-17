package com.facebook.aura.commands.contacts;

import X.AbstractC07127nr;
import X.AbstractC0885AGm;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.F60;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.Context;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.provider.ContactsContract;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandResponse;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.core.NodeExecutionContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class ContactsDeleteHandler implements HatchNodeCommandHandler {
    public static final ContactsDeleteHandler INSTANCE = new ContactsDeleteHandler();

    public final class ContactDeleteInput {
        public final String path;
        public final String platformId;
        public final Long rawContactId;

        public final String getPath() {
            return this.path;
        }

        public final String getPlatformId() {
            return this.platformId;
        }

        public final Long getRawContactId() {
            return this.rawContactId;
        }

        public ContactDeleteInput(String str, String str2, Long l) {
            this.path = str;
            this.platformId = str2;
            this.rawContactId = l;
        }
    }

    public final class ContactDeleteResult {
        public final int deletedRawContactCount;
        public final ContactDeleteInput input;
        public final ContactWriteTarget target;

        public final int getDeletedRawContactCount() {
            return this.deletedRawContactCount;
        }

        public final ContactDeleteInput getInput() {
            return this.input;
        }

        public final ContactWriteTarget getTarget() {
            return this.target;
        }

        public ContactDeleteResult(ContactDeleteInput contactDeleteInput, ContactWriteTarget contactWriteTarget, int i) {
            AnonymousClass003.A0u(contactDeleteInput, contactWriteTarget);
            this.input = contactDeleteInput;
            this.target = contactWriteTarget;
            this.deletedRawContactCount = i;
        }
    }

    public final class ContactResolvedDelete {
        public final ContactDeleteInput input;
        public final ContactWriteTarget target;

        public final ContactDeleteInput getInput() {
            return this.input;
        }

        public final ContactWriteTarget getTarget() {
            return this.target;
        }

        public ContactResolvedDelete(ContactDeleteInput contactDeleteInput, ContactWriteTarget contactWriteTarget) {
            AnonymousClass003.A0u(contactDeleteInput, contactWriteTarget);
            this.input = contactDeleteInput;
            this.target = contactWriteTarget;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.contacts.ContactsDeleteHandler$execute$2", f = "ContactsDeleteHandler.kt", l = {58, 69, 116, 120}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.contacts.ContactsDeleteHandler$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NodeCommandResponse>, Object> {
        public final /* synthetic */ HatchNodeCommandContext $commandContext;
        public final /* synthetic */ NodeExecutionContext $ctx;
        public final /* synthetic */ String $paramsJson;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, NodeExecutionContext nodeExecutionContext, HatchNodeCommandContext hatchNodeCommandContext, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$paramsJson = str;
            this.$ctx = nodeExecutionContext;
            this.$commandContext = hatchNodeCommandContext;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$paramsJson, this.$ctx, this.$commandContext, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x00a5 A[PHI: r4
  0x00a5: PHI (r4v5 java.lang.String) = (r4v4 java.lang.String), (r4v6 java.lang.String) binds: [B:25:0x009c, B:27:0x00a3] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 371
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.contacts.ContactsDeleteHandler.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super NodeCommandResponse> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final ContactDeleteInput parseDeleteInput(JsonObject jsonObject, String str) {
        String strOptionalStringParam = ContactsWriteSupportKt.optionalStringParam(jsonObject, ContactsWriteSupportKt.CONTACT_PARAM_PLATFORM_ID);
        Long lLongParam = ContactsWriteSupportKt.longParam(jsonObject, ContactsWriteSupportKt.CONTACT_PARAM_RAW_CONTACT_ID);
        if (lLongParam == null || lLongParam.longValue() <= 0) {
            lLongParam = null;
        }
        return new ContactDeleteInput(str, strOptionalStringParam, lLongParam);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ContactDeleteInput> parseDeleteInputs(JsonObject jsonObject) {
        List<JsonObject> listObjectListParam = ContactsWriteSupportKt.objectListParam(jsonObject, "targets_json", "targets");
        if (listObjectListParam == null) {
            throw C60O.A0i("targets_json is required");
        }
        ArrayList<ContactDeleteInput> arrayListA0i = AnonymousClass003.A0i(listObjectListParam);
        int i = 0;
        for (JsonObject jsonObject2 : listObjectListParam) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            arrayListA0i.add(INSTANCE.parseDeleteInput(jsonObject2, C60Q.A0k("targets[", i)));
            i = i2;
        }
        if (arrayListA0i.isEmpty()) {
            throw C60O.A0i("At least one contact delete target is required.");
        }
        for (ContactDeleteInput contactDeleteInput : arrayListA0i) {
            String str = contactDeleteInput.path;
            String strA0M = str != null ? FGI.A0M(str, ".") : "";
            if (contactDeleteInput.platformId == null && contactDeleteInput.rawContactId == null) {
                throw C60O.A0i(FGI.A0d(strA0M, "platform_id or ", strA0M, "raw_contact_id is required. Use platformId from the contacts data source, or raw_contact_id returned by contacts.create."));
            }
        }
        return arrayListA0i;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.CONTACTS_DELETE;
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
        return ContactsCommandSpecs.CONTACTS_DELETE;
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
    public final List<ContactDeleteResult> deleteContacts(Context context, List<ContactResolvedDelete> list) throws RemoteException, OperationApplicationException {
        int i;
        ContentProviderResult contentProviderResult;
        Integer num;
        int iIntValue;
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        Iterator<ContactResolvedDelete> it = list.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            arrayListA0m.add(ContentProviderOperation.newDelete(ContactsContract.RawContacts.CONTENT_URI).withSelection("contact_id = ? AND deleted = 0", C60Q.A1a(it.next().target.contactId)).build());
        }
        ContentProviderResult[] contentProviderResultArrApplyBatch = context.getContentResolver().applyBatch("com.android.contacts", new ArrayList<>(arrayListA0m));
        C7384Etj.A0U(contentProviderResultArrApplyBatch);
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list);
        for (ContactResolvedDelete contactResolvedDelete : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            ContactResolvedDelete contactResolvedDelete2 = contactResolvedDelete;
            if (i >= contentProviderResultArrApplyBatch.length || (contentProviderResult = contentProviderResultArrApplyBatch[i]) == null || (num = contentProviderResult.count) == null || (iIntValue = num.intValue()) <= 0) {
                throw C3cG.A0Q("Failed to delete contact. The contact may no longer exist.");
            }
            arrayListA0m2.add(new ContactDeleteResult(contactResolvedDelete2.input, contactResolvedDelete2.target, iIntValue));
            i = i2;
        }
        return arrayListA0m2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ContactResolvedDelete> resolveDeleteTargets(Context context, List<ContactDeleteInput> list) {
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (ContactDeleteInput contactDeleteInput : list) {
            ContactWriteTarget contactWriteTargetResolveContactWriteTarget = ContactsWriteSupportKt.resolveContactWriteTarget(context, contactDeleteInput.platformId, contactDeleteInput.rawContactId);
            if (contactWriteTargetResolveContactWriteTarget == null) {
                String str = contactDeleteInput.path;
                if (str == null) {
                    str = "the contact";
                }
                throw C60Q.A0V("Contact not found for ", str, ". Refresh the contacts data source and retry with a current platformId.");
            }
            arrayListA0i.add(new ContactResolvedDelete(contactDeleteInput, contactWriteTargetResolveContactWriteTarget));
        }
        return arrayListA0i;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public Object execute(AbstractC3358CGz abstractC3358CGz, HatchNodeCommandContext hatchNodeCommandContext, String str, NodeExecutionContext nodeExecutionContext, HtJ<? super NodeCommandResponse> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, nodeExecutionContext, hatchNodeCommandContext, null));
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ Object optionalDevicePermissions(String str, Context context, HtJ<? super List<String>> htJ) {
        return null;
    }
}
