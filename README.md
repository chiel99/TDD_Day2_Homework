# TDD_Day2_Homework

[![Build Status](https://api.travis-ci.org/chiel99/TDD_Day2_Homework.svg?branch=master)](https://travis-ci.org/chiel99/TDD_Day2_Homework)
[![codecov](https://codecov.io/gh/chiel99/TDD_Day2_Homework/branch/master/graph/badge.svg)](https://codecov.io/gh/chiel99/TDD_Day2_Homework)

## PotterShoppingCart

### 作業規範：
- 使用 GitHub
- 先寫測試案例，得到一個紅燈之後，commit，請不要寫第二個紅燈，而是先用最少、最簡單、最直覺的 code, 只針對這個紅燈變綠燈來完成需求，跟眼前紅燈無關的，一行 prod code 都不多寫。變綠燈之後 commit，接著檢視是否需要重構，若需要，重構之後 commit。
- 至少要有八個測試案例
- 第二個綠燈，應該最多只有一個 if，而且不會出現 0.95 或 0.05 以外的數字。
- 請盡可能地讓程式碼可讀性高一點
- 這個作業你不需要用到任何 interface
- 請謹慎思考命名

### User Story
哈利波特一到五冊熱潮正席捲全球，世界各地的孩子都為之瘋狂。
出版社為了慶祝TDD課程招生順利，決定訂出極大的優惠，來回饋給為了小孩四處奔波買書的父母親們。
定價的方式如下：
1. 一到五集的哈利波特，每一本都是賣100元
2. 如果你從這個系列買了兩本不同的書，則會有5%的折扣
3. 如果你買了三本不同的書，則會有10%的折扣
4. 如果是四本不同的書，則會有20%的折扣
5. 如果你一次買了整套一到五集，恭喜你將享有25%的折扣
6. 需要留意的是，如果你買了四本書，其中三本不同，第四本則是重複的，
   那麼那三本將享有10%的折扣，但重複的那一本，則仍須100元。
 你的任務是，設計一個哈利波特的購物車，能提供最便宜的價格給這些爸爸媽媽。

### Feature: PotterShoppingCart
	In order to 提供最便宜的價格給來買書的爸爸媽媽
  
	As a 佛心的出版社老闆
  
	I want to 設計一個哈利波特的購物車

### Scenario: 第一集買了一本，其他都沒買，價格應為100*1=100元
```	
  	Given 第一集買了 1 本
  
	And 第二集買了 0 本
  
	And 第三集買了 0 本
  
	And 第四集買了 0 本
  
	And 第五集買了 0 本
  
	When 結帳
  
	Then 價格應為 100 元
```

### Scenario: 第一集買了一本，第二集也買了一本，價格應為100*2*0.95=190
```
	Given 第一集買了 1 本
  
	And 第二集買了 1 本
  
	And 第三集買了 0 本
  
	And 第四集買了 0 本
  
	And 第五集買了 0 本
  
	When 結帳
  
	Then 價格應為 190 元
```

### Scenario: 一二三集各買了一本，價格應為100*3*0.9=270
```
	Given 第一集買了 1 本
  
	And 第二集買了 1 本
  
	And 第三集買了 1 本
  
	And 第四集買了 0 本
  
	And 第五集買了 0 本
  
	When 結帳
  
	Then 價格應為 270 元
```

### Scenario: 一二三四集各買了一本，價格應為100*4*0.8=320
```
	Given 第一集買了 1 本
  
	And 第二集買了 1 本
  
	And 第三集買了 1 本
  
	And 第四集買了 1 本
  
	And 第五集買了 0 本
  
	When 結帳
  
	Then 價格應為 320 元
```

### Scenario: 一次買了整套，一二三四五集各買了一本，價格應為100*5*0.75=375
```	
  	Given 第一集買了 1 本
  
	And 第二集買了 1 本
  
	And 第三集買了 1 本
  
	And 第四集買了 1 本
  
	And 第五集買了 1 本
  
	When 結帳
  
	Then 價格應為 375 元
```

### Scenario: 一二集各買了一本，第三集買了兩本，價格應為100*3*0.9 + 100 = 370
```
	Given 第一集買了 1 本
  
	And 第二集買了 1 本
  
	And 第三集買了 2 本
  
	And 第四集買了 0 本
  
	And 第五集買了 0 本
  
	When 結帳
  
	Then 價格應為 370 元
```

### Scenario: 第一集買了一本，第二三集各買了兩本，價格應為100*3*0.9 + 100*2*0.95 = 460
```
  	Given 第一集買了 1 本
  
	And 第二集買了 2 本
  
	And 第三集買了 2 本
  
	And 第四集買了 0 本
  
	And 第五集買了 0 本
  
	When 結帳
  
	Then 價格應為 460 元
```

### Scenario: 選便宜的算法
```
  Given 第一集買了 2 本
  
	And 第二集買了 2 本
  
	And 第三集買了 2 本
  
	And 第四集買了 1 本
  
	And 第五集買了 1 本
  
	When 結帳
  
	Then 價格應為 4本+4本=640 元
```

### Scenario: 選便宜的算法, 兩套 5 + 4
```
	Given 第一集買了 2 本
	
	And 第二集買了 2 本
	
	And 第三集買了 2 本
	
	And 第四集買了 2 本
	
	And 第五集買了 1 本
	
	When 結帳
	
	Then 價格應為 5本+4本 = 695 元		
```	

### Scenario: 選便宜的算法，四套 5+3+5+3
```
	Given 第一集買了 4 本
	
	And 第二集買了 4 本
	
	And 第三集買了 4 本
	
	And 第四集買了 2 本
	
	And 第五集買了 2 本
	
	When 結帳
	
	Then 價格應為 640*2=1280 元	
```	
