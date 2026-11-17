package com.facebook.rsys.call.gen;

import X.AbstractC7608F5v;
import X.AnonymousClass006;
import X.BV8;
import X.C3cH;
import X.C60O;
import X.C8926Fti;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.call.datamessage.gen.DataMessage;
import com.facebook.rsys.callcontext.gen.CallContext;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class AddUsersOptions {
    public static G50<AddUsersOptions> CONVERTER = C8926Fti.A00(10);
    public static long sMcfTypeId;
    public final ArrayList<DataMessage> customDataMessages;
    public final CallContext newCallContext;

    public static native AddUsersOptions createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AddUsersOptions) {
                AddUsersOptions addUsersOptions = (AddUsersOptions) obj;
                CallContext callContext = this.newCallContext;
                CallContext callContext2 = addUsersOptions.newCallContext;
                if (callContext != null ? callContext.equals(callContext2) : callContext2 == null) {
                    ArrayList<DataMessage> arrayList = this.customDataMessages;
                    ArrayList<DataMessage> arrayList2 = addUsersOptions.customDataMessages;
                    if (arrayList == null) {
                        if (arrayList2 != null) {
                            return false;
                        }
                    } else if (arrayList.equals(arrayList2)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AbstractC7608F5v.A02(AnonymousClass006.A0D(this.newCallContext)) + C3cH.A02(this.customDataMessages);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("AddUsersOptions{newCallContext=");
        sbA0x.append(this.newCallContext);
        sbA0x.append(",customDataMessages=");
        return BV8.A0v(this.customDataMessages, sbA0x);
    }

    public AddUsersOptions(CallContext callContext, ArrayList<DataMessage> arrayList) {
        this.newCallContext = callContext;
        this.customDataMessages = arrayList;
    }
}
