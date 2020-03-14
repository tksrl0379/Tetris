{\rtf1\ansi\ansicpg949\cocoartf2511
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;\f1\fnil\fcharset129 AppleSDGothicNeo-Regular;\f2\fnil\fcharset0 LucidaGrande;
}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sl280\partightenfactor0

\f0\fs24 \cf2 \expnd0\expndtw0\kerning0
\outl0\strokewidth0 \strokec2 import javax.swing.*;\
import java.awt.*;\
import java.awt.event.*;\
import javax.swing.event.*;\
import java.util.*;\
\uc0\u8232 \
\uc0\u8232 \
\uc0\u8232 \
\uc0\u8232 \
/* 1. 
\f1 \'ba\'ed\'b7\'cf
\f0  
\f1 \'b6\'b3\'be\'ee\'c1\'f6\'b1\'e2
\f0  
\f1 \'b1\'b8\'c7\'f6
\f0 \
\'a0* 2. 
\f1 \'ba\'ed\'b7\'cf
\f0  7
\f1 \'b0\'a1\'c1\'f6
\f0  
\f1 \'c8\'ad\'b8\'e9
\f0  
\f1 \'c3\'e2\'b7\'c2
\f0  
\f1 \'b1\'b8\'c7\'f6
\f0 \
\'a0* 3. 
\f1 \'c8\'b8\'c0\'fc
\f0  
\f1 \'b1\'b8\'c7\'f6
\f0 \
\'a0* 4. 
\f1 \'ba\'ae
\f0  
\f1 \'b1\'b8\'c7\'f6
\f0  (
\f1 \'ba\'ae\'c0\'ba
\f0  1, 
\f1 \'ba\'f3
\f0  
\f1 \'b0\'f8\'b0\'a3\'c0\'ba
\f0  0)\
\'a0* 5. 
\f1 \'b6\'b3\'be\'ee\'c1\'f6\'b4\'c2
\f0  
\f1 \'ba\'ed\'b7\'cf\'c0\'cc
\f0  
\f1 \'b9\'d9\'b4\'da\'bf\'a1
\f0  
\f1 \'b4\'ea\'c0\'b8\'b8\'e9
\f0  
\f1 \'b8\'d8\'c3\'df\'b0\'ed
\f0  
\f1 \'ba\'ae\'c0\'b8\'b7\'ce
\f0  
\f1 \'ba\'af\'c7\'cf\'b5\'b5\'b7\'cf
\f0  
\f1 \'b1\'b8\'c7\'f6
\f0 \
\'a0* 6. 
\f1 \'ba\'ae
\f0  
\f1 \'b7\'a3\'b4\'fd\'c7\'cf\'b0\'d4
\f0  
\f1 \'b6\'b3\'be\'ee\'c1\'f6\'b5\'b5\'b7\'cf
\f0  
\f1 \'b1\'b8\'c7\'f6
\f0 \'a0\
\'a0* 7. 
\f1 \'b6\'b3\'be\'ee\'c1\'f6\'b4\'c2
\f0  
\f1 \'ba\'ed\'b7\'cf\'c0\'cc
\f0  
\f1 \'bf\'de\'c2\'ca
\f0 , 
\f1 \'bf\'c0\'b8\'a5\'c2\'ca
\f0  
\f1 \'ba\'ae\'c0\'bb
\f0  
\f1 \'b9\'fe\'be\'ee\'b3\'aa\'c1\'f6
\f0  
\f1 \'b8\'f8\'c7\'cf\'b0\'d4
\f0  
\f1 \'b8\'b8\'b5\'ea
\f0 , 
\f1 \'ba\'ed\'b7\'cf\'c0\'cc
\f0  
\f1 \'ba\'ae\'bf\'a1
\f0  
\f1 \'b4\'ea\'be\'c6\'c0\'d6\'c0\'b8\'b8\'e9
\f0  
\f1 \'c8\'b8\'c0\'fc
\f0  
\f1 \'b8\'f8\'c7\'cf\'b0\'d4
\f0  
\f1 \'b8\'b8\'b5\'ea
\f0  \'a0<- 
\f1 \'bc\'f6\'c1\'a4\'bf\'cf\'b7\'e1\'c7\'cf\'b1\'e4
\f0  
\f1 \'c7\'df\'b4\'c2\'b5\'a5
\f0  
\f1 \'c1\'bb
\f0  
\f1 \'ba\'d2\'bf\'cf\'c0\'fc
\f0 \
\'a0* 8. 
\f1 \'b4\'d9\'c0\'bd
\f0  
\f1 \'b6\'b3\'be\'ee\'c1\'fa
\f0  
\f1 \'ba\'ed\'b7\'cf
\f0  
\f1 \'b9\'cc\'b8\'ae
\f0  
\f1 \'ba\'b8\'bf\'a9\'c1\'f6\'b5\'b5\'b7\'cf
\f0  
\f1 \'b1\'b8\'c7\'f6
\f0  < - JLabel 
\f1 \'c0\'a7\'c4\'a1
\f0  
\f1 \'c1\'b6\'c1\'a4
\f0 \
\'a0* 9. 
\f1 \'c7\'d1
\f0  
\f1 \'c7\'e0\'bf\'a1
\f0  
\f1 \'ba\'ed\'b7\'cf\'c0\'cc
\f0  
\f1 \'b8\'f0\'b5\'ce
\f0  
\f1 \'c2\'f7\'b8\'e9
\f0  
\f1 \'b1\'d7
\f0  
\f1 \'c7\'e0\'bf\'a1
\f0  
\f1 \'c0\'d6\'b4\'c2
\f0  
\f1 \'ba\'ed\'b7\'cf\'c0\'bb
\f0  
\f1 \'be\'f8\'be\'d6\'b0\'ed
\f0  
\f1 \'c0\'a7\'bf\'a1
\f0  
\f1 \'c0\'d6\'b4\'c2
\f0  
\f1 \'b8\'f0\'b5\'e7
\f0  
\f1 \'ba\'ed\'b7\'cf\'c0\'cc
\f0  
\f1 \'b6\'b3\'be\'ee\'c1\'f6\'b5\'b5\'b7\'cf
\f0  
\f1 \'b1\'b8\'c7\'f6
\f0  (
\f1 \'b6\'b3\'be\'ee\'c1\'f6\'b4\'c2
\f0  
\f1 \'ba\'ed\'b7\'cf
\f0  
\f1 \'c0\'dc\'bb\'f3
\f0  
\f1 \'b3\'b2\'be\'c6\'c0\'d6\'b4\'c2
\f0  
\f1 \'b9\'f6\'b1\'d7
\f0 , 
\f1 \'b8\'ee\'b0\'a1\'c1\'f6
\f0  
\f1 \'b9\'f6\'b1\'d7
\f0  
\f1 \'bc\'f6\'c1\'a4\'bf\'cf\'b7\'e1
\f0 )\
\'a0* 10. 
\f1 \'c0\'e7\'b5\'b5\'c0\'fc
\f0  
\f1 \'b9\'f6\'c6\'b0
\f0 \
\'a0* 11. 
\f1 \'c1\'a1\'bc\'f6
\f0  
\f1 \'b7\'b9\'c0\'cc\'ba\'ed
\f0  
\f1 \'b8\'b8\'b5\'e9\'b1\'e2
\f0  <- 
\f1 \'b5\'f0\'c0\'da\'c0\'ce
\f0  
\f1 \'bc\'f6\'c1\'a4
\f0  
\f1 \'c7\'ca\'bf\'e4
\f0 \
\'a0* 12. JDialog 
\f1 \'c0\'cc\'bf\'eb\'c7\'d8\'bc\'ad
\f0  
\f1 \'b0\'d4\'c0\'d3
\f0  
\f1 \'bf\'c0\'b9\'f6\'bd\'c3
\f0  
\f1 \'c1\'a1\'bc\'f6
\f0  
\f1 \'b7\'b9\'c0\'cc\'ba\'ed
\f0 , 
\f1 \'c0\'e7\'b5\'b5\'c0\'fc
\f0  
\f1 \'b9\'f6\'c6\'b0
\f0  
\f1 \'b6\'df\'b5\'b5\'b7\'cf
\f0  
\f1 \'b1\'b8\'c7\'f6
\f0 \'a0\
\'a0* 13. 
\f1 \'c8\'b8\'c0\'fc
\f0  
\f1 \'ba\'ce\'ba\'d0
\f0  
\f1 \'b9\'f6\'b1\'d7
\f0  
\f1 \'bc\'f6\'c1\'a4
\f0 .\
\'a0* */\
\uc0\u8232 \
\uc0\u8232 \
public class TetrisEx extends JFrame \{\
\'a0 \'a0Container c = getContentPane();\
\'a0 \'a0TetrisPanel TP = new TetrisPanel();\
\'a0 \'a0JDialog JD = new JDialog();\
\'a0 \'a0TetrisThread th;\
\'a0 \'a0\
\'a0 \'a0static int blocksize = 20;\
\'a0 \'a0\
\'a0 \'a0int End = 0;\
\'a0 \'a0int random = 0 , random2 = (int)(Math.random()*7);\
\'a0 \'a0\
\'a0 \'a0int score =0;\
\'a0 \'a0\
\'a0 \'a0int wid=100;\
\'a0 \'a0int hgt= 0;\
\'a0 \'a0int rotation = 0;\
\'a0 \'a0\
\'a0 \'a0boolean limit = false;\
\'a0 \'a0\
\'a0 \'a0int curX[]= new int[4], curY[] = new int [4]; // 
\f1 \'ba\'ed\'b7\'cf\'b5\'e9\'c0\'c7
\f0  
\f1 \'c1\'c2\'c7\'a5
\f0  
\f1 \'c0\'fa\'c0\'e5
\f0 \
\'a0 \'a0\
\'a0 \'a0int blocks[][][][] \'a0=\'a0\
\'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 //
\f2 \uc0\u9632 
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 //
\f2 \uc0\u9632 \u9632 \u9632 
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1,0,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1,1,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1,1,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 \'a0 \'a0\},\
\'a0 \'a0 \'a0 \'a0 \'a0\{\
\uc0\u8232 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0// \'a0
\f2 \uc0\u9632 
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0//
\f2 \uc0\u9632 \u9632 \u9632 
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1,1,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1,1,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1,0,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 \'a0 \'a0\},\
\'a0 \'a0 \'a0 \'a0 \'a0\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0// \'a0
\f2 \uc0\u9632 \u9632 
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0// \'a0
\f2 \uc0\u9632 \u9632 
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 \'a0 \'a0\},\
\'a0 \'a0 \'a0 \'a0 \'a0\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0// 
\f2 \uc0\u9632 \u9632 \u9632 \u9632 
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1,1,1,1\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1,1,1,1\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 \'a0 \'a0\},\
\'a0 \'a0 \'a0 \'a0 \'a0\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 //
\f2 \uc0\u9632 
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0//
\f2 \uc0\u9632 \u9632 \u9632 
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1,1,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1,1,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \} \'a0\'a0\
\'a0 \'a0 \'a0 \'a0 \'a0\},\
\'a0 \'a0 \'a0 \'a0 \'a0\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 // \'a0
\f2 \uc0\u9632 \u9632 
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 // \'a0 
\f2 \uc0\u9632 \u9632 
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 \'a0 \'a0\},\
\'a0 \'a0 \'a0 \'a0 \'a0\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 // \'a0
\f2 \uc0\u9632 \u9632 
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0// \'a0
\f2 \uc0\u9632 \u9632 
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,0,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,1,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,1,0\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{0,0,0,0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \} \'a0\'a0\
\'a0 \'a0 \'a0 \'a0 \'a0\}\
\'a0 \'a0\};\
\'a0 \'a0\
\'a0 \'a0int[][] gameboard = \{\{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1\},\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1\}\};\
\uc0\u8232 \
\'a0 \'a0JButton btn = new JButton("
\f1 \'c0\'e7\'b5\'b5\'c0\'fc
\f0 ");\
\'a0 \'a0JLabel lbl = new JLabel();\
\'a0 \'a0JLabel lbl2 = new JLabel();\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0TetrisEx()\{\
\'a0 \'a0 \'a0 setTitle("
\f1 \'c5\'d7\'c6\'ae\'b8\'ae\'bd\'ba
\f0 ");\
\'a0 \'a0 \'a0 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);\
\'a0 \'a0 \'a0 setLayout(null);\
\'a0 \'a0 \'a0 TP.setSize(720,600);\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 add(TP);\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 th = new TetrisThread();\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 // JDialog\'a0\
\'a0 \'a0 \'a0 JD.setTitle("
\f1 \'c1\'a1\'bc\'f6
\f0 ");\
\'a0 \'a0 \'a0 JD.setSize(250,190);\
\'a0 \'a0 \'a0 JD.setLayout(new FlowLayout(FlowLayout.CENTER, 150, 30));\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 lbl.setFont(new Font("arial",Font.PLAIN,15));\
\'a0 \'a0 \'a0 lbl2.setText("
\f1 \'c1\'a1
\f0  \'a0
\f1 \'bc\'f6
\f0 ");\
\'a0 \'a0 \'a0 lbl2.setFont(new Font("
\f1 \'b3\'aa\'b4\'ae\'b0\'ed\'b5\'f1
\f0 ",Font.PLAIN,15));\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 TP.addKeyListener(new KeyAdapter()\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 public void keyPressed(KeyEvent e)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0int keyCode = e.getKeyCode();\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0if(keyCode == KeyEvent.VK_UP)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 TP.moveUp();\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0if(keyCode == KeyEvent.VK_DOWN)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 TP.moveDown();\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0if(keyCode == KeyEvent.VK_LEFT)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 TP.moveLeft();\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0if(keyCode == KeyEvent.VK_RIGHT)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 TP.moveRight();\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 \'a0 \'a0\});\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 btn.addActionListener(new ActionListener()\{\
\'a0 \'a0 \'a0 \'a0 \'a0public void actionPerformed(ActionEvent e)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 limit = false;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 for(int y=0; y<19;y++)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0for(int x=1; x<12; x++)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 gameboard[y][x] =0 ;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 score =0;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 wid =100; hgt = 0;\
\'a0 \'a0 \'a0 \'a0 \'a0\}\
\'a0 \'a0 \'a0 \});\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 TP.setBackground(Color.WHITE);\
\'a0 \'a0 \'a0 setSize(530,520);\
\'a0 \'a0 \'a0 setVisible(true);\
\uc0\u8232 \
\uc0\u8232 \
\'a0 \'a0 \'a0 // 
\f1 \'c8\'ad\'b8\'e9
\f0  
\f1 \'c1\'df\'be\'d3
\f0  
\f1 \'c1\'a4\'b7\'c4
\f0 \
\'a0 \'a0 \'a0 Dimension frameSize = this.getSize();\
\'a0 \'a0 \'a0 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();\
\'a0 \'a0 \'a0 setLocation((screenSize.width - frameSize.width)/2, (screenSize.height - frameSize.height)/2);\
\'a0 \'a0 \'a0 JD.setLocation((screenSize.width - frameSize.width)/2 + 220, (screenSize.height - frameSize.height)/2 +220);\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 TP.requestFocus(true);\
\'a0 \'a0 \'a0 th.start();\
\'a0 \'a0\}\
\'a0 \'a0\
\'a0 \'a0\
\'a0 \'a0\
\'a0 \'a0class TetrisPanel extends JPanel\{\
\'a0 \'a0 \'a0 public void paintComponent(Graphics g)\{\
\'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0int cnt = 0 , cnt2 = 0;\
\'a0 \'a0 \'a0 \'a0 \'a0TP.requestFocus(true);\
\'a0 \'a0 \'a0 \'a0 \'a0super.paintComponent(g);\
\'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0lbl2.setLocation(353,120);\
\'a0 \'a0 \'a0 \'a0 \'a0TP.add(lbl2);\
\'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0lbl.setLocation(360,145);\
\'a0 \'a0 \'a0 \'a0 \'a0TP.add(lbl);\
\'a0 \'a0 \'a0 \'a0 \'a0lbl.setText(Integer.toString(score*100));\
\'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0g.setColor(Color.ORANGE); // 
\f1 \'bb\'f5\'b7\'ce
\f0  
\f1 \'b6\'b3\'be\'ee\'c1\'f6\'b4\'c2
\f0  
\f1 \'ba\'ed\'b7\'b0
\f0 ,
\f1 \'b9\'cc\'b8\'ae\'ba\'b8\'b1\'e2
\f0  \'a0
\f1 \'ba\'ed\'b7\'b0
\f0  
\f1 \'bb\'f6\'b1\'f2
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0// 
\f1 \'b4\'d9\'c0\'bd
\f0  
\f1 \'b3\'aa\'bf\'c3
\f0  
\f1 \'b5\'b5\'c7\'fc
\f0  
\f1 \'c3\'e2\'b7\'c2
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0blockLookAhead(g);\
\'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0// 
\f1 \'ba\'ae\'c0\'cc
\f0  
\f1 \'c3\'b5\'c0\'e5\'bf\'a1
\f0  
\f1 \'b4\'ea\'c0\'b8\'b8\'e9
\f0  
\f1 \'b0\'d4\'c0\'d3
\f0  
\f1 \'bf\'c0\'b9\'f6
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0gameOverCheck();\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 \'a0 \'a0// 
\f1 \'c7\'d1
\f0  
\f1 \'c7\'e0\'c0\'cc
\f0  
\f1 \'b8\'f0\'b5\'ce
\f0  
\f1 \'ba\'ed\'b7\'cf\'c0\'b8\'b7\'ce
\f0  
\f1 \'c3\'a4\'bf\'f6\'c1\'f8
\f0  
\f1 \'b0\'e6\'bf\'ec
\f0  
\f1 \'ba\'ed\'b7\'cf\'b5\'e9
\f0  
\f1 \'c1\'a6\'b0\'c5
\f0 (
\f1 \'c3\'a4\'bf\'f6\'c1\'f6\'c1\'f6\'be\'ca\'c0\'ba
\f0  
\f1 \'b0\'e6\'bf\'ec
\f0  
\f1 \'ba\'ed\'b7\'cf
\f0  
\f1 \'b6\'b3\'be\'ee\'c1\'f6\'b5\'b5\'b7\'cf
\f0 )\
\'a0 \'a0 \'a0 \'a0 \'a0removeBlock(cnt, cnt2, g);\
\'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0// 
\f1 \'ba\'ed\'b7\'cf\'c0\'cc
\f0  
\f1 \'ba\'ae\'bf\'a1
\f0  
\f1 \'c2\'f8\'c1\'f6\'c7\'cf\'b8\'e9
\f0  
\f1 \'ba\'ed\'b7\'cf
\f0 ->
\f1 \'ba\'ae\'c0\'b8\'b7\'ce
\f0  
\f1 \'ba\'af\'c8\'af
\f0 (
\f1 \'b6\'b3\'be\'ee\'c1\'f6\'b4\'c2
\f0  
\f1 \'ba\'ed\'b7\'cf
\f0  
\f1 \'c3\'ca\'b1\'e2\'c8\'ad
\f0 )\
\'a0 \'a0 \'a0 \'a0 \'a0blockToWall();\
\'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0// 
\f1 \'ba\'ae\'b5\'e9\'c0\'bb
\f0  
\f1 \'bb\'fd\'bc\'ba
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0makeBlock(g);\
\'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0// 
\f1 \'c5\'d7\'b5\'ce\'b8\'ae
\f0  
\f1 \'bb\'fd\'bc\'ba
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0makeBorder(g);\
\'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0if(End == 1)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 random2 = (int)(Math.random()*7);\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 End = 0;\
\'a0 \'a0 \'a0 \'a0 \'a0\}\
\'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 public void blockLookAhead(Graphics g)\{\
\'a0 \'a0 \'a0 \'a0 \'a0for(int a = 0; a<4 ;a++)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 for(int b = 0; b<4;b++)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0if(blocks[random2][0][a][b] == 1)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 g.fill3DRect(b*blocksize+120, a*blocksize, blocksize, blocksize, true);\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 public void gameOverCheck()\{\
\'a0 \'a0 \'a0 \'a0 \'a0for(int x=1;x<12;x++)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0if(gameboard[2][x]==1)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 limit = true;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 //lbl.setLocation(50,50);\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 JD.add(lbl);\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 JD.add(btn);\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 //btn.setLocation(50,30);\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 JD.setVisible(true);\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\}\
\'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 public void removeBlock(int cnt, int cnt2, Graphics g)\{\
\'a0 \'a0 \'a0 \'a0 \'a0for(int y =0;y<19;y++)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0for(int x =1; x<12 ; x++)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 if(gameboard[y][x] == 1)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0cnt2++;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0if(cnt2 == 11)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 for(int i=y;i>1;i--)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0for(int j=1;j<13;j++)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 gameboard[i][j] = 0;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 gameboard[i][j] = gameboard[i-1][j];\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0score++;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\}else\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 blockDown(cnt,g); // 
\f1 \'c7\'d1
\f0  
\f1 \'c7\'e0\'c0\'cc
\f0  
\f1 \'b8\'f0\'b5\'ce
\f0  
\f1 \'ba\'ed\'b7\'cf\'c0\'b8\'b7\'ce
\f0  
\f1 \'c3\'a4\'bf\'f6\'c1\'f6\'c1\'f6
\f0  
\f1 \'be\'ca\'c0\'bb
\f0  
\f1 \'b6\'a7\'b8\'b8
\f0  
\f1 \'ba\'ed\'b7\'cf\'c0\'cc
\f0  
\f1 \'b3\'bb\'b7\'c1\'b0\'a1\'b5\'b5\'b7\'cf
\f0  
\f1 \'c7\'d4
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0cnt2 = 0 ;\
\'a0 \'a0 \'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 public void makeBlock(Graphics g)\{\
\'a0 \'a0 \'a0 \'a0 \'a0g.setColor(Color.GRAY);\'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 for(int y=0; y<19;y++)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0for(int x=1; x<12; x++)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 if(gameboard[y][x]== 1)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0g.fill3DRect( x*blocksize+20, y*blocksize+60, blocksize, blocksize, true);\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 public void blockDown(int cnt, Graphics g)\{\
\'a0 \'a0 \'a0 \'a0 \'a0for(int j = 0; j<4 ;j++)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 for(int k = 0; k<4;k++)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0if(blocks[random][rotation][j][k] == 1)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 curX[cnt] = ((k*blocksize)+wid)/blocksize; curY[cnt] = ((j*blocksize)+hgt)/blocksize;//curX,Y[0][1][2][3]
\f1 \'bf\'a1
\f0  
\f1 \'c1\'c2\'c7\'a5
\f0  4
\f1 \'b0\'b3
\f0  
\f1 \'c0\'fa\'c0\'e5
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 g.fill3DRect(curX[cnt]*blocksize+20, curY[cnt]*blocksize+60, blocksize, blocksize, true);\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 cnt ++;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0\}\
\'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 // 
\f1 \'b6\'b3\'be\'ee\'c1\'f6\'b4\'f8
\f0  
\f1 \'ba\'ed\'b7\'cf\'c0\'cc
\f0  
\f1 \'ba\'ae\'c0\'cc
\f0  
\f1 \'b5\'c7\'b4\'c2\'c1\'f6
\f0  
\f1 \'b0\'cb\'bb\'e7
\f0 \
\'a0 \'a0 \'a0 // 
\f1 \'ba\'ae\'c0\'cc
\f0  
\f1 \'b5\'c7\'b8\'e9
\f0  wid=120, hgt=0 
\f1 \'c0\'b8\'b7\'ce
\f0  
\f1 \'ba\'ed\'b7\'cf
\f0  
\f1 \'c3\'ca\'b1\'e2\'c8\'ad
\f0 , rotation
\f1 \'b5\'b5
\f0  
\f1 \'c3\'ca\'b1\'e2\'c8\'ad
\f0 \'a0\
\'a0 \'a0 \'a0 public void blockToWall()\{\
\'a0 \'a0 \'a0 \'a0 \'a0try\{\
\'a0 \'a0 \'a0 \'a0 \'a0for(int z = 0; z<4 ; z++)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 if(gameboard[curY[z]+1][curX[z]] == 1)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 for (int j= 0; j<4;j++)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 gameboard[curY[j]][curX[j]] = 1;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 wid =100;\'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 hgt =0;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 End = 1;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 rotation = 0;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 random = random2;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 \'a0 \'a0\}catch(ArrayIndexOutOfBoundsException e)\{ System.out.println("Error");\
\'a0 \'a0 \'a0 \'a0 \'a0for(int i=0; i<4 ; i++)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0System.out.print("("+curY[i]+","+curX[i]+")");\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 System.out.println();\}\
\'a0 \'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 // 
\f1 \'bf\'de\'c2\'ca
\f0  
\f1 \'ba\'ae\'bf\'a1
\f0  
\f1 \'c3\'e6\'b5\'b9\'c7\'cf\'b8\'e9
\f0  
\f1 \'b8\'f8\'bf\'f2\'c1\'f7\'c0\'cc\'b5\'b5\'b7\'cf
\f0 \
\'a0 \'a0 \'a0 public int collision_LEFT()\{\
\'a0 \'a0 \'a0 \'a0 \'a0for(int i=0; i<4; i++)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 if(gameboard[curY[i]][curX[i]-1] == 1) \'a0// 
\f1 \'c3\'e6\'b5\'b9\'bd\'c3
\f0  1 
\f1 \'b9\'dd\'c8\'af
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0return 1;\
\'a0 \'a0 \'a0 \'a0 \'a0\}\
\'a0 \'a0 \'a0 \'a0 \'a0return 0; // 
\f1 \'c3\'e6\'b5\'b9\'c7\'cf\'c1\'f6
\f0  
\f1 \'be\'ca\'c0\'b8\'b8\'e9
\f0  0 
\f1 \'b9\'dd\'c8\'af
\f0 \
\'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 // 
\f1 \'bf\'c0\'b8\'a5\'c2\'ca
\f0  
\f1 \'ba\'ae\'bf\'a1
\f0  
\f1 \'c3\'e6\'b5\'b9\'c7\'cf\'b8\'e9
\f0  
\f1 \'b8\'f8
\f0  
\f1 \'bf\'f2\'c1\'f7\'c0\'cc\'b5\'b5\'b7\'cf
\f0 \
\'a0 \'a0 \'a0 public int collision_RIGHT()\{\
\uc0\u8232 \
\'a0 \'a0 \'a0 \'a0 \'a0for(int i=0; i<4; i++)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 if(gameboard[curY[i]][curX[i]+1] == 1) \'a0 // 
\f1 \'c3\'e6\'b5\'b9\'bd\'c3
\f0  1
\f1 \'b9\'dd\'c8\'af
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0return 1;\
\'a0 \'a0 \'a0 \'a0 \'a0\}\
\'a0 \'a0 \'a0 \'a0 \'a0return 0; // 
\f1 \'c3\'e6\'b5\'b9\'c7\'cf\'c1\'f6
\f0  
\f1 \'be\'ca\'c0\'b8\'b8\'e9
\f0  0
\f1 \'b9\'dd\'c8\'af
\f0 \
\'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 // curX,Y
\f1 \'bf\'a1
\f0  
\f1 \'b4\'d9\'c0\'bd
\f0  
\f1 \'c8\'b8\'c0\'fc
\f0  
\f1 \'b5\'b5\'c7\'fc\'c0\'c7
\f0  
\f1 \'c0\'fd\'b4\'eb\'c1\'c2\'c7\'a5\'b8\'a6
\f0  
\f1 \'b8\'f0\'b5\'ce
\f0  
\f1 \'b1\'e2\'b7\'cf\'c7\'d8\'b5\'ce\'b0\'ed
\f0 , 
\f1 \'b8\'b8\'be\'e0
\f0  
\f1 \'bf\'c0\'b8\'a5\'c2\'ca\'c0\'cc\'b3\'aa
\f0  
\f1 \'bf\'de\'c2\'ca
\f0  X
\f1 \'c1\'c2\'c7\'a5
\f0 1,2
\f1 \'c4\'ad
\f0  
\f1 \'be\'c8\'bf\'a1
\f0  
\f1 \'ba\'ae\'c0\'cc
\f0  
\f1 \'c0\'d6\'c0\'b8\'b8\'e9
\f0  
\f1 \'b1\'d7\'b8\'b8\'c5\'ad
\f0  
\f1 \'bf\'c0\'b8\'a5\'c2\'ca
\f0  
\f1 \'c8\'a4\'c0\'ba
\f0  
\f1 \'bf\'de\'c2\'ca\'c0\'b8\'b7\'ce
\f0  
\f1 \'b9\'d0\'be\'ee\'bc\'ad
\f0  
\f1 \'b9\'e8\'c4\'a1
\f0 \
\'a0 \'a0 \'a0 public void rotationCheck()\{\
\'a0 \'a0 \'a0 \'a0// curX,Y
\f1 \'bf\'a1
\f0  
\f1 \'b4\'d9\'c0\'bd
\f0  
\f1 \'c8\'b8\'c0\'fc
\f0  
\f1 \'b5\'b5\'c7\'fc\'c0\'c7
\f0  
\f1 \'c0\'fd\'b4\'eb\'c1\'c2\'c7\'a5\'b8\'a6
\f0  
\f1 \'b8\'f0\'b5\'ce
\f0  
\f1 \'b1\'e2\'b7\'cf\'c7\'d8\'b5\'ce\'b0\'ed
\f0 , 
\f1 \'b9\'d8\'bf\'a1
\f0  
\f1 \'b1\'b8\'b9\'ae\'bf\'a1\'bc\'ad
\f0  
\f1 \'b1\'d7
\f0  
\f1 \'c0\'fd\'b4\'eb\'c1\'c2\'c7\'a5\'c0\'c7
\f0  
\f1 \'b0\'aa\'c0\'cc
\f0  
\f1 \'ba\'ae\'bf\'a1
\f0  
\f1 \'b4\'ea\'b4\'c2\'c1\'f6
\f0  
\f1 \'c6\'c7\'b4\'dc
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0int cnt2=0;\
\'a0 \'a0 \'a0 \'a0 \'a0 for(int j = 0; j<4 ;j++)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 for(int k = 0; k<4;k++)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0int rotation2 = (rotation%4)+1 ;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0if(rotation2 == 4)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 rotation2 = 0;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0if(blocks[random][rotation2][j][k] == 1)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 curX[cnt2] = ((k*blocksize)+wid)/blocksize; curY[cnt2] = ((j*blocksize)+hgt)/blocksize;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 cnt2++;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\} \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 \'a0// curX,Y
\f1 \'bf\'a1
\f0  
\f1 \'c0\'fa\'c0\'e5\'b5\'c8
\f0  
\f1 \'c1\'c2\'c7\'a5\'b8\'a6
\f0  
\f1 \'c0\'cc\'bf\'eb
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 int chk = 0;\
\'a0 \'a0 \'a0 \'a0 \'a0 int blank =0;\
\'a0 \'a0 \'a0 \'a0 \'a0 int error = 0;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0// 
\f1 \'bf\'de\'c2\'ca
\f0  
\f1 \'ba\'ae
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 if(gameboard[curY[0]][curX[0]] == 1 || (random == 6 && gameboard[curY[2]][curX[2]] == 1) || (random == 1 && gameboard[curY[1]][curX[1]] ==1 ))\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0chk = 1; // 
\f1 \'b8\'b8\'be\'e0
\f0  
\f1 \'b4\'d9\'c0\'bd
\f0  
\f1 \'c8\'b8\'c0\'fc\'c7\'d1
\f0  
\f1 \'b5\'b5\'c7\'fc\'c0\'c7
\f0  
\f1 \'c0\'a7\'c4\'a1\'b0\'a1
\f0  
\f1 \'ba\'ae\'b0\'fa
\f0  
\f1 \'b0\'e3\'c4\'a3\'b4\'d9\'b8\'e9
\f0  chk=1
\f1 \'b7\'ce
\f0  
\f1 \'c7\'a5\'bd\'c3\'c7\'d4
\f0  \'a0 \'a0 \'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0error++;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0System.out.println("chk1");\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0if(random == 3)\{ // 
\f1 \'c0\'cf\'c0\'da\'b8\'b7\'b4\'eb\'c0\'c7
\f0  
\f1 \'b0\'e6\'bf\'ec
\f0  
\f1 \'c8\'b8\'c0\'fc\'c7\'d2
\f0  
\f1 \'bf\'a9\'c0\'af\'b0\'a1
\f0  
\f1 \'c0\'d6\'b4\'c2
\f0  
\f1 \'b0\'f8\'b9\'e9\'c0\'cc
\f0  
\f1 \'be\'f8\'c0\'b8\'b8\'e9
\f0  
\f1 \'c8\'b8\'c0\'fc\'b8\'b7\'c0\'bd
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 for(int i=1;i<5;i++)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0if(gameboard[curY[0]][curX[0]+i] == 0)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 blank++;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 if(blank < 4)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0chk = 4;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 System.out.println(blank);\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\}else\{ // 
\f1 \'b1\'d7
\f0  
\f1 \'bf\'dc\'c0\'c7
\f0  
\f1 \'b0\'e6\'bf\'ec
\f0  
\f1 \'c8\'b8\'c0\'fc\'c7\'d2
\f0  
\f1 \'bf\'a9\'c0\'af\'b0\'a1
\f0  
\f1 \'be\'f8\'b4\'c2
\f0  
\f1 \'b0\'f8\'b9\'e9\'c0\'cc
\f0  
\f1 \'be\'f8\'c0\'b8\'b8\'e9
\f0  
\f1 \'c8\'b8\'c0\'fc
\f0  
\f1 \'b8\'b7\'c0\'bd
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 for(int i=1; i<4;i++)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0if(gameboard[curY[0]][curX[0]+i] == 0)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 blank++;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 if(blank <3)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0chk = 4;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 System.out.println("blank2");\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 System.out.println(blank);\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 //
\f1 \'bf\'c0\'b8\'a5\'c2\'ca
\f0  
\f1 \'ba\'ae
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 else if(gameboard[curY[2]][curX[2]] == 1)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 error++;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0chk = 2; // 
\f1 \'b8\'b8\'be\'e0
\f0  
\f1 \'b4\'d9\'c0\'bd
\f0  
\f1 \'c8\'b8\'c0\'fc\'c7\'d1
\f0  
\f1 \'b5\'b5\'c7\'fc\'c0\'c7
\f0  
\f1 \'c0\'a7\'c4\'a1\'b0\'a1
\f0  
\f1 \'ba\'ae\'b0\'fa
\f0  
\f1 \'b0\'e3\'c4\'a3\'b4\'d9\'b8\'e9
\f0  chk=2
\f1 \'b7\'ce
\f0  
\f1 \'c7\'a5\'bd\'c3\'c7\'d4
\f0  \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0System.out.println("chk2");\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0for(int i=1; i<5;i++)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 if(gameboard[curY[2]][curX[2]-i] == 0)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0blank ++;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0if(blank < 4)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 chk = 4;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0System.out.println("blank2");\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0System.out.println(blank);\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 else if(gameboard[curY[3]][curX[3]] == 1)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0error++;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0chk = 3; // 
\f1 \'b8\'b8\'be\'e0
\f0  
\f1 \'b4\'d9\'c0\'bd
\f0  
\f1 \'c8\'b8\'c0\'fc\'c7\'d1
\f0  
\f1 \'b5\'b5\'c7\'fc\'c0\'c7
\f0  
\f1 \'c0\'a7\'c4\'a1\'b0\'a1
\f0  
\f1 \'ba\'ae\'b0\'fa
\f0  
\f1 \'b0\'e3\'c4\'a3\'b4\'d9\'b8\'e9
\f0  chk=3
\f1 \'b7\'ce
\f0  
\f1 \'c7\'a5\'bd\'c3\'c7\'d4
\f0  \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0System.out.println("chk3");\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0for(int i=0; i<5;i++)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 if(gameboard[curY[3]][curX[3]-i] == 0)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0blank ++;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0if(blank < 4)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 chk = 4;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0System.out.println(blank);\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 if(chk == 1)\{ // chk = 1(
\f1 \'b4\'d9\'c0\'bd
\f0  
\f1 \'c8\'b8\'c0\'fc\'c7\'d1
\f0  
\f1 \'b5\'b5\'c7\'fc\'c0\'c7
\f0  
\f1 \'c0\'a7\'c4\'a1\'b0\'a1
\f0  
\f1 \'ba\'ae\'b0\'fa
\f0  
\f1 \'c1\'df\'ba\'b9\'b5\'c7\'b8\'e9
\f0 )
\f1 \'b8\'e9
\f0  wid(
\f1 \'b0\'a1\'b7\'ce
\f0 )
\f1 \'b7\'ce
\f0  30
\f1 \'c0\'cc\'b5\'bf
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0wid += blocksize;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0rotation++;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0rotation = rotation%4;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \}else if (chk ==2)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0wid -= blocksize*2;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0rotation++;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0rotation = rotation%4;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \}else if (chk ==3)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0wid -= blocksize;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0rotation++;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0rotation = rotation%4;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \}else if(chk == 4)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0System.out.println("ban");\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \}else\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0rotation++;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 rotation = rotation%4;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 public void makeBorder(Graphics g)\{\
\'a0 \'a0 \'a0 \'a0 \'a0g.setColor(Color.GRAY);\
\'a0 \'a0 \'a0 \'a0 \'a0\
\'a0 \'a0 \'a0 \'a0 \'a0g.draw3DRect(28, 70, 5, 375,true); // 
\f1 \'b1\'e2\'b5\'d5
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0g.draw3DRect(265, 70, 5, 375, true); // 
\f1 \'b1\'e2\'b5\'d5
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0g.draw3DRect(15, 445, 270, 5,true); // 
\f1 \'b9\'d9\'b4\'da
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0g.draw3DRect(15, 65, 270, 5, true); // 
\f1 \'c3\'b5\'c0\'e5
\f0 \
\'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0\'a0\
\'a0 \'a0 \'a0 void down()\{\
\'a0 \'a0 \'a0 \'a0 \'a0hgt +=blocksize;\
\'a0 \'a0 \'a0 \'a0 \'a0TP.repaint();\
\'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 void moveUp()\{\
\'a0 \'a0 \'a0 \'a0 \'a0rotationCheck();\
\'a0 \'a0 \'a0 \'a0 \'a0 if(limit == false)\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0repaint();\
\'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 void moveDown()\{\
\'a0 \'a0 \'a0 \'a0 \'a0if(limit == false)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 hgt += blocksize;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 TP.repaint();\
\'a0 \'a0 \'a0 \'a0 \'a0\}\
\'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 void moveLeft()\{\
\'a0 \'a0 \'a0 \'a0 \'a0int sel = collision_LEFT();// sel
\f1 \'c0\'cc
\f0  1
\f1 \'c0\'cc\'b8\'e9
\f0  
\f1 \'c3\'e6\'b5\'b9
\f0 , 0
\f1 \'c0\'cc\'b8\'e9
\f0  
\f1 \'c3\'e6\'b5\'b9
\f0 X\
\'a0 \'a0 \'a0 \'a0 \'a0if(sel == 0 && limit == false)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 wid -= blocksize;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0TP.repaint();\
\'a0 \'a0 \'a0 \'a0 \'a0\}\
\'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 void moveRight()\{\
\'a0 \'a0 \'a0 \'a0 \'a0int sel = collision_RIGHT();// sel
\f1 \'c0\'cc
\f0  1
\f1 \'c0\'cc\'b8\'e9
\f0  
\f1 \'c3\'e6\'b5\'b9
\f0 , 0
\f1 \'c0\'cc\'b8\'e9
\f0  
\f1 \'c3\'e6\'b5\'b9
\f0 X\
\'a0 \'a0 \'a0 \'a0 \'a0if(sel == 0 && limit == false)\{\'a0\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 wid += blocksize;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 TP.repaint();\
\'a0 \'a0 \'a0 \'a0 \'a0\}\
\'a0 \'a0 \'a0 \}\
\'a0 \'a0\}\
\'a0 \'a0\
\'a0 \'a0class TetrisThread extends Thread\{\
\'a0 \'a0 \'a0 TetrisPanel TP = new TetrisPanel();\
\'a0 \'a0 \'a0 public void run()\{\
\'a0 \'a0 \'a0 \'a0 \'a0while(true)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 try\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0sleep(500);\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0if(limit == false) // limit
\f1 \'c0\'cc
\f0  false
\f1 \'c0\'cf
\f0  
\f1 \'b0\'e6\'bf\'ec\'bf\'a1\'b8\'b8
\f0  
\f1 \'c0\'db\'b5\'bf
\f0 . true
\f1 \'b0\'a1
\f0  
\f1 \'b5\'c7\'b8\'e9
\f0  
\f1 \'c5\'d7\'c6\'ae\'b8\'ae\'bd\'ba
\f0  
\f1 \'c0\'db\'b5\'bf\'c1\'df\'c1\'f6
\f0 \
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 TP.down();\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \}catch(InterruptedException e)\{\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \'a0return;\
\'a0 \'a0 \'a0 \'a0 \'a0 \'a0 \}\
\'a0 \'a0 \'a0 \'a0 \'a0\}\
\'a0 \'a0 \'a0 \}\
\'a0 \'a0\}\
\'a0 \'a0\
\'a0 \'a0public static void main(String[] args)\{\
\'a0 \'a0 \'a0 new TetrisEx();\
\'a0 \'a0\}\
\}\
}