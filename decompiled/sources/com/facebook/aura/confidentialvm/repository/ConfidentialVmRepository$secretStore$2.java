package com.facebook.aura.confidentialvm.repository;

import X.A7K;
import X.ACW;
import X.ACf;
import X.ADo;
import X.AbstractC7559F3s;
import X.C3cG;
import X.C60N;
import X.C7384Etj;
import X.CH0;
import X.FGI;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.aura.common.appcontext.AuraAppContext;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ConfidentialVmRepository$secretStore$2 extends AbstractC7559F3s implements Function0<A7K> {
    public final /* synthetic */ ConfidentialVmRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfidentialVmRepository$secretStore$2(ConfidentialVmRepository confidentialVmRepository) {
        super(0);
        this.this$0 = confidentialVmRepository;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final A7K invoke() {
        Context context = AuraAppContext.INSTANCE.getContext();
        if (context == null) {
            throw C3cG.A0Q(C60N.A00(41));
        }
        String str = ((CH0) this.this$0.userSession).A01;
        SQLiteDatabase writableDatabase = new ACf(context, FGI.A0U(ConfidentialVmRepository.SECRET_DB_PREFIX, str, ".db"), null, 1).getWritableDatabase();
        C7384Etj.A0X(writableDatabase);
        return new A7K(new ADo(true, "hatchcvm_local_secret_key_after_first_unlock"), new ACW(writableDatabase), str);
    }
}
