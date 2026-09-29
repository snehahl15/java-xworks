package com.xworkz.rbiapp;

import com.xworkz.rbiapp.rbi.*;

public class RBIRunner {
    public static void main(String[] args) {


        RBI rbi = new SBI();
        rbi.monitorUPITraffic();
        rbi.verifyKYCOnboarding();

         RBI rbi1 = new CanaraBank();
         rbi1.verifyKYCOnboarding();
         rbi1.auditSLRHoldings();
         rbi1.monitorUPITraffic();
         rbi1.buyGovSecDirect();

         RBI rbi2 = new HDFC();

        System.out.println("\n--- Executing 25 Overridden RBI Operations --- \n");

        // 1. Monetary Policy & Liquidity Operations
        rbi2.simulateRepoRateImpact();
        rbi2.parkSurplusFunds();
        rbi2.checkCRRCompliance();
        rbi2.auditSLRHoldings();
        rbi2.executeOMOAuction();

        // 2. Payments & Digital Infrastructure Operations
        rbi2.monitorUPITraffic();
        rbi2.fetchULIUnderwritingData();
        rbi2.transferOfflineCBDC();
        rbi2.settleHighValueRTGS();
        rbi2.processNEFTBatch();


        // 3. Supervision & Regulation Operations
        rbi2.verifyKYCOnboarding();
        rbi2.checkPCARiskMatrix();
        rbi2.reportFraudAccount();
        rbi2.checkDICGCInsurance();
        rbi2.fileOmbudsmanGrievance();

        // 4. Forex & Sovereign Debt Management Operations
        rbi2.getForexReserveStatus();
        rbi2.triggerRupeeIntervention();
        rbi2.subscribeToSGBTranche();
        rbi2.buyGovSecDirect();
        rbi2.validateFEMADocuments();

        // 5. Currency & Public Ledger Operations
        rbi2.trackCurrencyChestLogistics();
        rbi2.scanCounterfeitNote();
        rbi2.recycleSoiledCurrency();
        rbi2.reconcileGovLedger();
        rbi2.rewardLiteracyQuizProgress();

        RBI rbi3 = new ICICI();
        System.out.println("\n--- Executing 25 Overridden RBI Operations via rbi3 --- \n");

        // 1. Monetary Policy & Liquidity Operations
        rbi3.simulateRepoRateImpact();
        rbi3.parkSurplusFunds();
        rbi3.checkCRRCompliance();
        rbi3.auditSLRHoldings();
        rbi3.executeOMOAuction();

        // 2. Payments & Digital Infrastructure Operations
        rbi3.monitorUPITraffic();
        rbi3.fetchULIUnderwritingData();
        rbi3.transferOfflineCBDC();
        rbi3.settleHighValueRTGS();
        rbi3.processNEFTBatch();

        // 3. Supervision & Regulation Operations
        rbi3.verifyKYCOnboarding();
        rbi3.checkPCARiskMatrix();
        rbi3.reportFraudAccount();
        rbi3.checkDICGCInsurance();
        rbi3.fileOmbudsmanGrievance();

        // 4. Forex & Sovereign Debt Management Operations
        rbi3.getForexReserveStatus();
        rbi3.triggerRupeeIntervention();
        rbi3.subscribeToSGBTranche();
        rbi3.buyGovSecDirect();
        rbi3.validateFEMADocuments();

        // 5. Currency & Public Ledger Operations
        rbi3.trackCurrencyChestLogistics();
        rbi3.scanCounterfeitNote();
        rbi3.recycleSoiledCurrency();
        rbi3.reconcileGovLedger();
        rbi3.rewardLiteracyQuizProgress();
    }
}
