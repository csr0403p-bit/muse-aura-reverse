package com.facebook.aura.commands.contacts;

import X.AbstractC07127nr;
import X.AbstractC0885AGm;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3UX;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C7384Etj;
import X.C7BY;
import X.CFK;
import X.EnumC10460Hji;
import X.F60;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HxE;
import android.accounts.Account;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentUris;
import android.content.Context;
import android.content.OperationApplicationException;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.provider.ContactsContract;
import com.facebook.aura.commands.sms.MessageDraftSenderKt;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandResponse;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.core.NodeExecutionContext;
import com.facebook.aura.nodes.core.NodeExecutionKt;
import com.facebook.aura.nodes.registry.HatchNodeCommandContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class ContactsCreateHandler implements HatchNodeCommandHandler {
    public static final ContactsCreateHandler INSTANCE = new ContactsCreateHandler();

    public final class ContactCreateInput {
        public final String displayName;
        public final String email;
        public final String emailLabel;
        public final String jobTitle;
        public final String note;
        public final String organization;
        public final String path;
        public final String phoneLabel;
        public final String phoneNumber;

        public ContactCreateInput(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            C7384Etj.A0Y(str2, 1);
            AnonymousClass005.A16(str3, str4, str5, str6, 2);
            AnonymousClass005.A13(str7, str8, str9, 6);
            this.path = str;
            this.displayName = str2;
            this.phoneNumber = str3;
            this.phoneLabel = str4;
            this.email = str5;
            this.emailLabel = str6;
            this.organization = str7;
            this.jobTitle = str8;
            this.note = str9;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getEmailLabel() {
            return this.emailLabel;
        }

        public final String getJobTitle() {
            return this.jobTitle;
        }

        public final String getNote() {
            return this.note;
        }

        public final String getOrganization() {
            return this.organization;
        }

        public final String getPath() {
            return this.path;
        }

        public final String getPhoneLabel() {
            return this.phoneLabel;
        }

        public final String getPhoneNumber() {
            return this.phoneNumber;
        }
    }

    public final class ContactCreateResult {
        public final String displayName;
        public final long rawContactId;

        public ContactCreateResult(String str, long j) {
            C7384Etj.A0Y(str, 0);
            this.displayName = str;
            this.rawContactId = j;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final long getRawContactId() {
            return this.rawContactId;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.contacts.ContactsCreateHandler$execute$2", f = "ContactsCreateHandler.kt", l = {59, MessageDraftSenderKt.UNICODE_SINGLE_PART_CHARS, 75, 94, 103}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.contacts.ContactsCreateHandler$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NodeCommandResponse>, Object> {
        public final /* synthetic */ HatchNodeCommandContext $commandContext;
        public final /* synthetic */ NodeExecutionContext $ctx;
        public final /* synthetic */ String $paramsJson;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
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

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            NodeExecutionContext nodeExecutionContext;
            NodeCommandResponse nodeCommandResponse;
            Object objDeliver = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "unknown error";
                }
                String strA0M = FGI.A0M("Failed to create contact: ", message);
                CFK.A08(ContactsCreateHandlerKt.TAG, strA0M, e);
                nodeExecutionContext = this.$ctx;
                nodeCommandResponse = new NodeCommandResponse(false, null, strA0M, null, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 5;
            }
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    Hwg.A00(objDeliver);
                    return obj;
                }
                if (i == 4) {
                    Hwg.A00(objDeliver);
                    return (NodeCommandResponse) objDeliver;
                }
                if (i == 5) {
                    Hwg.A00(objDeliver);
                }
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(objDeliver);
            JsonObject contactsParams = ContactsWriteSupportKt.parseContactsParams(this.$paramsJson);
            if (contactsParams == null) {
                nodeExecutionContext = this.$ctx;
                nodeCommandResponse = new NodeCommandResponse(false, null, "Could not parse parameters JSON", null, null);
                this.label = 1;
            } else {
                try {
                    ContactsCreateHandler contactsCreateHandler = ContactsCreateHandler.INSTANCE;
                    List createInputs = contactsCreateHandler.parseCreateInputs(contactsParams);
                    if (!createInputs.isEmpty()) {
                        List listInsertContacts = contactsCreateHandler.insertContacts(this.$commandContext.context, createInputs);
                        ArrayList arrayListA0i = AnonymousClass003.A0i(listInsertContacts);
                        int i2 = 0;
                        for (Object obj2 : listInsertContacts) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                AbstractC0885AGm.A14();
                                throw F60.createAndThrow();
                            }
                            String str = ((ContactCreateResult) obj2).displayName;
                            String str2 = ((ContactCreateInput) createInputs.get(i2)).phoneNumber;
                            if (C7BY.A0j(str2)) {
                                str2 = null;
                            }
                            arrayListA0i.add(new ContactsCardItemInput(str, str2));
                            i2 = i3;
                        }
                        listInsertContacts.size();
                        NodeExecutionContext nodeExecutionContext2 = this.$ctx;
                        NodeCommandResponse nodeCommandResponse2 = new NodeCommandResponse(true, null, null, ContactsCardInstructionKt.contactsCardEnvelope("created", arrayListA0i), null);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 4;
                        objDeliver = NodeExecutionKt.deliver(nodeExecutionContext2, nodeCommandResponse2, this);
                        if (objDeliver == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                        return (NodeCommandResponse) objDeliver;
                    }
                    nodeExecutionContext = this.$ctx;
                    nodeCommandResponse = new NodeCommandResponse(false, null, "At least one contact to create is required.", null, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                } catch (IllegalArgumentException e2) {
                    NodeExecutionContext nodeExecutionContext3 = this.$ctx;
                    NodeCommandResponse nodeCommandResponse3 = new NodeCommandResponse(false, null, e2.getMessage(), null, null);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 2;
                    objDeliver = NodeExecutionKt.deliver(nodeExecutionContext3, nodeCommandResponse3, this);
                    if (objDeliver == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
            }
            objDeliver = NodeExecutionKt.deliver(nodeExecutionContext, nodeCommandResponse, this);
            return objDeliver == enumC10460Hji ? enumC10460Hji : objDeliver;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super NodeCommandResponse> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void addStructuredName(List<ContentProviderOperation> list, int i, String str) {
        C60R.A0v(dataInsert(i, "vnd.android.cursor.item/name").withValue("data1", str), list);
    }

    private final ContentProviderOperation.Builder dataInsert(int i, String str) {
        ContentProviderOperation.Builder builderWithValue = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference(ContactsWriteSupportKt.CONTACT_PARAM_RAW_CONTACT_ID, i).withValue("mimetype", str);
        C7384Etj.A0U(builderWithValue);
        return builderWithValue;
    }

    private final Account defaultAccountForNewContacts(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            ContactsContract.RawContacts.DefaultAccount.DefaultAccountAndState defaultAccountForNewContacts = ContactsContract.RawContacts.DefaultAccount.getDefaultAccountForNewContacts(context.getContentResolver());
            C7384Etj.A0U(defaultAccountForNewContacts);
            Account account = defaultAccountForNewContacts.getAccount();
            if (defaultAccountForNewContacts.getState() == 3) {
                return account;
            }
        } else if (i >= 33) {
            return ContactsContract.Settings.getDefaultAccount(context.getContentResolver());
        }
        return null;
    }

    private final ContactCreateInput parseCreateInput(JsonObject jsonObject, String str) {
        return new ContactCreateInput(str, ContactsWriteSupportKt.stringParam(jsonObject, "display_name"), ContactsWriteSupportKt.stringParam(jsonObject, "phone_number"), ContactsWriteSupportKt.stringParam(jsonObject, "phone_label"), ContactsWriteSupportKt.stringParam(jsonObject, "email"), ContactsWriteSupportKt.stringParam(jsonObject, "email_label"), ContactsWriteSupportKt.stringParam(jsonObject, "organization"), ContactsWriteSupportKt.stringParam(jsonObject, "job_title"), ContactsWriteSupportKt.stringParam(jsonObject, "note"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ContactCreateInput> parseCreateInputs(JsonObject jsonObject) {
        List<JsonObject> listObjectListParam = ContactsWriteSupportKt.objectListParam(jsonObject, "contacts_json", HatchNodeCardJsonKt.TYPE_CONTACTS);
        if (listObjectListParam == null) {
            throw C60O.A0i("contacts_json is required");
        }
        ArrayList<ContactCreateInput> arrayListA0i = AnonymousClass003.A0i(listObjectListParam);
        int i = 0;
        for (JsonObject jsonObject2 : listObjectListParam) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            arrayListA0i.add(INSTANCE.parseCreateInput(jsonObject2, C60Q.A0k("contacts[", i)));
            i = i2;
        }
        for (ContactCreateInput contactCreateInput : arrayListA0i) {
            if (C7BY.A0j(contactCreateInput.displayName)) {
                String str = contactCreateInput.path;
                throw C60Q.A0V("Missing required parameter: ", str != null ? FGI.A0M(str, ".") : "", "display_name");
            }
        }
        return arrayListA0i;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.CONTACTS_CREATE;
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
        return ContactsCommandSpecs.CONTACTS_CREATE;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean isEnabled() {
        return true;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ String validateParams(String str) {
        return null;
    }

    private final void addEmail(List<ContentProviderOperation> list, int i, String str, String str2) {
        if (C7BY.A0j(str)) {
            return;
        }
        HxE<Integer, String> hxEEmailTypeAndLabel = ContactsWriteSupportKt.emailTypeAndLabel(str2);
        int iA0F = AnonymousClass001.A0F(hxEEmailTypeAndLabel.first);
        String str3 = hxEEmailTypeAndLabel.second;
        ContentProviderOperation.Builder builderWithValue = dataInsert(i, "vnd.android.cursor.item/email_v2").withValue("data1", str).withValue("data2", Integer.valueOf(iA0F));
        C7384Etj.A0U(builderWithValue);
        if (str3 != null) {
            builderWithValue.withValue("data3", str3);
        }
        C60R.A0v(builderWithValue, list);
    }

    private final void addNote(List<ContentProviderOperation> list, int i, String str) {
        if (C7BY.A0j(str)) {
            return;
        }
        C60R.A0v(dataInsert(i, "vnd.android.cursor.item/note").withValue("data1", str), list);
    }

    private final void addOrganization(List<ContentProviderOperation> list, int i, String str, String str2) {
        if (C7BY.A0j(str) && C7BY.A0j(str2)) {
            return;
        }
        ContentProviderOperation.Builder builderWithValue = dataInsert(i, "vnd.android.cursor.item/organization").withValue("data2", 1);
        C7384Etj.A0U(builderWithValue);
        if (!C7BY.A0j(str)) {
            builderWithValue.withValue("data1", str);
        }
        if (!C7BY.A0j(str2)) {
            builderWithValue.withValue("data4", str2);
        }
        C60R.A0v(builderWithValue, list);
    }

    private final void addPhone(List<ContentProviderOperation> list, int i, String str, String str2) {
        if (C7BY.A0j(str)) {
            return;
        }
        HxE<Integer, String> hxEPhoneTypeAndLabel = ContactsWriteSupportKt.phoneTypeAndLabel(str2);
        int iA0F = AnonymousClass001.A0F(hxEPhoneTypeAndLabel.first);
        String str3 = hxEPhoneTypeAndLabel.second;
        ContentProviderOperation.Builder builderWithValue = dataInsert(i, "vnd.android.cursor.item/phone_v2").withValue("data1", str).withValue("data2", Integer.valueOf(iA0F));
        C7384Etj.A0U(builderWithValue);
        if (str3 != null) {
            builderWithValue.withValue("data3", str3);
        }
        C60R.A0v(builderWithValue, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ContactCreateResult> insertContacts(Context context, List<ContactCreateInput> list) throws RemoteException, OperationApplicationException {
        ContentProviderResult contentProviderResult;
        Uri uri;
        Account accountDefaultAccountForNewContacts = defaultAccountForNewContacts(context);
        ArrayList<ContentProviderOperation> arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (ContactCreateInput contactCreateInput : list) {
            String str = null;
            ContentProviderOperation.Builder builderWithValue = ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", accountDefaultAccountForNewContacts != null ? accountDefaultAccountForNewContacts.type : null);
            if (accountDefaultAccountForNewContacts != null) {
                str = accountDefaultAccountForNewContacts.name;
            }
            arrayListA0h.add(builderWithValue.withValue("account_name", str).build());
            int size = arrayListA0h.size() - 1;
            C60Q.A1P(arrayListA0h2, size);
            ContactsCreateHandler contactsCreateHandler = INSTANCE;
            contactsCreateHandler.addStructuredName(arrayListA0h, size, contactCreateInput.displayName);
            contactsCreateHandler.addPhone(arrayListA0h, size, contactCreateInput.phoneNumber, contactCreateInput.phoneLabel);
            contactsCreateHandler.addEmail(arrayListA0h, size, contactCreateInput.email, contactCreateInput.emailLabel);
            contactsCreateHandler.addOrganization(arrayListA0h, size, contactCreateInput.organization, contactCreateInput.jobTitle);
            contactsCreateHandler.addNote(arrayListA0h, size, contactCreateInput.note);
        }
        ContentProviderResult[] contentProviderResultArrApplyBatch = context.getContentResolver().applyBatch("com.android.contacts", arrayListA0h);
        C7384Etj.A0U(contentProviderResultArrApplyBatch);
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h2);
        Iterator it = arrayListA0h2.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            int iA0F = AnonymousClass001.A0F(next);
            if (iA0F < 0 || iA0F >= contentProviderResultArrApplyBatch.length || (contentProviderResult = contentProviderResultArrApplyBatch[iA0F]) == null || (uri = contentProviderResult.uri) == null) {
                throw C3cG.A0Q("Contacts provider did not return a raw contact URI");
            }
            arrayListA0i.add(new ContactCreateResult(list.get(i).displayName, ContentUris.parseId(uri)));
            i = i2;
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
