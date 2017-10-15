<div style="width: 100%;"><div style="text-align: center;"><img src="/static/svg/XtremeLogo.svg" style="max-width: 360px; margin-bottom: -10px;"></div><div class="text-center"><h1>Gotta Catch 'Em All</h1><div>Time limit: <em>380 ms</em><br>Memory limit: <em>136 MB</em><br><br></div><div></div></div><div><p>Pokémon trainer Blue is starting his journey in the world of Pokémon and dreams of becoming a Pokémon master. Blue will be travelling to Viridian city for his first gym battle with his Pokémon Pikachu, but, in order to do so he has to pass through the Viridian forest. Blue's rival, Red is determined to stop Blue from becoming a Pokémon master. Hence, Red has laid traps in the Viridian forest with enemy Pokémon. These Pokémon will prevent Blue from proceeding further into the forest unless his Pikachu battles and defeats them. For each battle, Pikachu loses a portion of its health. Lucky for Blue, there are some unused health potions available in the forest. These potions can restore Pikachu's health. Can Pikachu fight all the enemy Pokémon? Will Blue reach the Viridian city? Or will Red be successful in his attempt to prevent Blue from becoming Pokémon master?
</p><p>The Viridian forest can be represented as an <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi>r</mi><mo>×</mo><mi>c</mi></mrow><annotation encoding="application/x-tex">r \times c</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.58333em;"></span><span class="strut bottom" style="height:0.66666em;vertical-align:-0.08333em;"></span><span class="base textstyle uncramped"><span class="mord mathit" style="margin-right:0.02778em;">r</span><span class="mbin">×</span><span class="mord mathit">c</span></span></span></span></span> (<span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mn>2</mn><mo>≤</mo><mi>r</mi><mo separator="true">,</mo><mi>c</mi><mo>≤</mo><mn>2</mn><mn>0</mn><mn>0</mn></mrow><annotation encoding="application/x-tex">2 \leq r, c \leq 200</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.64444em;"></span><span class="strut bottom" style="height:0.8388800000000001em;vertical-align:-0.19444em;"></span><span class="base textstyle uncramped"><span class="mord mathrm">2</span><span class="mrel">≤</span><span class="mord mathit" style="margin-right:0.02778em;">r</span><span class="mpunct">,</span><span class="mord mathit">c</span><span class="mrel">≤</span><span class="mord mathrm">2</span><span class="mord mathrm">0</span><span class="mord mathrm">0</span></span></span></span></span>) grid. Blue starts from location <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mo>(</mo><mn>1</mn><mo separator="true">,</mo><mn>1</mn><mo>)</mo></mrow><annotation encoding="application/x-tex">(1,1)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.75em;"></span><span class="strut bottom" style="height:1em;vertical-align:-0.25em;"></span><span class="base textstyle uncramped"><span class="mopen">(</span><span class="mord mathrm">1</span><span class="mpunct">,</span><span class="mord mathrm">1</span><span class="mclose">)</span></span></span></span></span> (which is on the top left part of the map) and needs to exit the Viridian forest from location <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mo>(</mo><mi>r</mi><mo separator="true">,</mo><mi>c</mi><mo>)</mo></mrow><annotation encoding="application/x-tex">(r,c)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.75em;"></span><span class="strut bottom" style="height:1em;vertical-align:-0.25em;"></span><span class="base textstyle uncramped"><span class="mopen">(</span><span class="mord mathit" style="margin-right:0.02778em;">r</span><span class="mpunct">,</span><span class="mord mathit">c</span><span class="mclose">)</span></span></span></span></span> in order to go to Viridian city. At any cell <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mo>(</mo><mi>i</mi><mo separator="true">,</mo><mi>j</mi><mo>)</mo></mrow><annotation encoding="application/x-tex">(i,j)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.75em;"></span><span class="strut bottom" style="height:1em;vertical-align:-0.25em;"></span><span class="base textstyle uncramped"><span class="mopen">(</span><span class="mord mathit">i</span><span class="mpunct">,</span><span class="mord mathit" style="margin-right:0.05724em;">j</span><span class="mclose">)</span></span></span></span></span>, Blue can only move down <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mo>(</mo><mi>i</mi><mo>+</mo><mn>1</mn><mo separator="true">,</mo><mi>j</mi><mo>)</mo></mrow><annotation encoding="application/x-tex">(i+1,j)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.75em;"></span><span class="strut bottom" style="height:1em;vertical-align:-0.25em;"></span><span class="base textstyle uncramped"><span class="mopen">(</span><span class="mord mathit">i</span><span class="mbin">+</span><span class="mord mathrm">1</span><span class="mpunct">,</span><span class="mord mathit" style="margin-right:0.05724em;">j</span><span class="mclose">)</span></span></span></span></span> or right <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mo>(</mo><mi>i</mi><mo separator="true">,</mo><mi>j</mi><mo>+</mo><mn>1</mn><mo>)</mo></mrow><annotation encoding="application/x-tex">(i,j+1)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.75em;"></span><span class="strut bottom" style="height:1em;vertical-align:-0.25em;"></span><span class="base textstyle uncramped"><span class="mopen">(</span><span class="mord mathit">i</span><span class="mpunct">,</span><span class="mord mathit" style="margin-right:0.05724em;">j</span><span class="mbin">+</span><span class="mord mathrm">1</span><span class="mclose">)</span></span></span></span></span> and he cannot move outside the grid. In any cell <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mo>(</mo><mi>i</mi><mo separator="true">,</mo><mi>j</mi><mo>)</mo></mrow><annotation encoding="application/x-tex">(i,j)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.75em;"></span><span class="strut bottom" style="height:1em;vertical-align:-0.25em;"></span><span class="base textstyle uncramped"><span class="mopen">(</span><span class="mord mathit">i</span><span class="mpunct">,</span><span class="mord mathit" style="margin-right:0.05724em;">j</span><span class="mclose">)</span></span></span></span></span> in the grid, there can either be a health potion or an enemy Pokémon which battles with Pikachu. Potions will be represented using positive integer and will increase Pikachu's health the value in the cell. Enemy Pokémon will be represented using negative integers and will reduce Pikachu's health by the value in the cell. If Pikachu's health drops to <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mn>0</mn></mrow><annotation encoding="application/x-tex">0</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.64444em;"></span><span class="strut bottom" style="height:0.64444em;vertical-align:0em;"></span><span class="base textstyle uncramped"><span class="mord mathrm">0</span></span></span></span></span> or less, Pikachu will no longer be able to fight and Blue will have to go back to his home. Then Red will be successful in his attempt and Blue will never complete his dream of becoming a Pokémon master. 
</p><p>Blue does not want to lose, but, is unable to plan his journey through the Viridian forest. So, he needs your help to plan the journey for him so that Pikachu trains until he increases his health capacity to the minimum health needed to defeat all the Pokémon in their journey to Viridian city.
</p><h2> Standard input
</h2><p>On the first line of the input there will be two integers <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi>r</mi></mrow><annotation encoding="application/x-tex">r</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.43056em;"></span><span class="strut bottom" style="height:0.43056em;vertical-align:0em;"></span><span class="base textstyle uncramped"><span class="mord mathit" style="margin-right:0.02778em;">r</span></span></span></span></span> and <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi>c</mi></mrow><annotation encoding="application/x-tex">c</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.43056em;"></span><span class="strut bottom" style="height:0.43056em;vertical-align:0em;"></span><span class="base textstyle uncramped"><span class="mord mathit">c</span></span></span></span></span> which give the size of the Viridian forest.
</p><p>On the following <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi>r</mi></mrow><annotation encoding="application/x-tex">r</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.43056em;"></span><span class="strut bottom" style="height:0.43056em;vertical-align:0em;"></span><span class="base textstyle uncramped"><span class="mord mathit" style="margin-right:0.02778em;">r</span></span></span></span></span> lines there will be a <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mi>c</mi></mrow><annotation encoding="application/x-tex">c</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.43056em;"></span><span class="strut bottom" style="height:0.43056em;vertical-align:0em;"></span><span class="base textstyle uncramped"><span class="mord mathit">c</span></span></span></span></span> integers, each one representing the value of each cell in the forest <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mo>(</mo><mi>i</mi><mo separator="true">,</mo><mi>j</mi><mo>)</mo></mrow><annotation encoding="application/x-tex">(i,j)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.75em;"></span><span class="strut bottom" style="height:1em;vertical-align:-0.25em;"></span><span class="base textstyle uncramped"><span class="mopen">(</span><span class="mord mathit">i</span><span class="mpunct">,</span><span class="mord mathit" style="margin-right:0.05724em;">j</span><span class="mclose">)</span></span></span></span></span> starting from position <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mo>(</mo><mn>1</mn><mo separator="true">,</mo><mn>1</mn><mo>)</mo></mrow><annotation encoding="application/x-tex">(1,1)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.75em;"></span><span class="strut bottom" style="height:1em;vertical-align:-0.25em;"></span><span class="base textstyle uncramped"><span class="mopen">(</span><span class="mord mathrm">1</span><span class="mpunct">,</span><span class="mord mathrm">1</span><span class="mclose">)</span></span></span></span></span>. Cells containing negative values contain enemy Pokémon and cells with positive values contain potions.
</p><p>Cells <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mo>(</mo><mn>1</mn><mo separator="true">,</mo><mn>1</mn><mo>)</mo></mrow><annotation encoding="application/x-tex">(1,1)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.75em;"></span><span class="strut bottom" style="height:1em;vertical-align:-0.25em;"></span><span class="base textstyle uncramped"><span class="mopen">(</span><span class="mord mathrm">1</span><span class="mpunct">,</span><span class="mord mathrm">1</span><span class="mclose">)</span></span></span></span></span> and <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mo>(</mo><mi>r</mi><mo separator="true">,</mo><mi>c</mi><mo>)</mo></mrow><annotation encoding="application/x-tex">(r,c)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.75em;"></span><span class="strut bottom" style="height:1em;vertical-align:-0.25em;"></span><span class="base textstyle uncramped"><span class="mopen">(</span><span class="mord mathit" style="margin-right:0.02778em;">r</span><span class="mpunct">,</span><span class="mord mathit">c</span><span class="mclose">)</span></span></span></span></span> are always <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mn>0</mn></mrow><annotation encoding="application/x-tex">0</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.64444em;"></span><span class="strut bottom" style="height:0.64444em;vertical-align:0em;"></span><span class="base textstyle uncramped"><span class="mord mathrm">0</span></span></span></span></span>.  
</p><h2> Standard output
</h2><p>Output a single integer, the minimum health that Pikachu needs for the journey.
</p><h2> Constraints and notes
</h2><ul><li><span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mn>2</mn><mo>≤</mo><mi>r</mi><mo separator="true">,</mo><mi>c</mi><mo>≤</mo><mn>2</mn><mn>0</mn><mn>0</mn></mrow><annotation encoding="application/x-tex">2 \leq r, c \leq 200</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.64444em;"></span><span class="strut bottom" style="height:0.8388800000000001em;vertical-align:-0.19444em;"></span><span class="base textstyle uncramped"><span class="mord mathrm">2</span><span class="mrel">≤</span><span class="mord mathit" style="margin-right:0.02778em;">r</span><span class="mpunct">,</span><span class="mord mathit">c</span><span class="mrel">≤</span><span class="mord mathrm">2</span><span class="mord mathrm">0</span><span class="mord mathrm">0</span></span></span></span></span> 
</li><li>The elements of the grid are integers in the interval <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mo>[</mo><mo>−</mo><mn>1</mn><mspace width="0.16667em"></mspace><mn>0</mn><mn>0</mn><mn>0</mn><mo separator="true">,</mo><mn>1</mn><mspace width="0.16667em"></mspace><mn>0</mn><mn>0</mn><mn>0</mn><mo>]</mo></mrow><annotation encoding="application/x-tex">[-1\,000, 1\,000]</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.75em;"></span><span class="strut bottom" style="height:1em;vertical-align:-0.25em;"></span><span class="base textstyle uncramped"><span class="mopen">[</span><span class="mord">−</span><span class="mord mathrm">1</span><span class="mord mspace thinspace"></span><span class="mord mathrm">0</span><span class="mord mathrm">0</span><span class="mord mathrm">0</span><span class="mpunct">,</span><span class="mord mathrm">1</span><span class="mord mspace thinspace"></span><span class="mord mathrm">0</span><span class="mord mathrm">0</span><span class="mord mathrm">0</span><span class="mclose">]</span></span></span></span></span>
</li></ul><p><table class=" table-36"><thead><tr><th>Input</th><th>Output</th><th>Explanation</th></tr></thead><tbody><tr><td><pre>2 2
0 -2
2 0
</pre></td><td><pre>1</pre></td><td><div><p>Blue can take the path from <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mo>(</mo><mn>1</mn><mo separator="true">,</mo><mn>1</mn><mo>)</mo></mrow><annotation encoding="application/x-tex">(1,1)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.75em;"></span><span class="strut bottom" style="height:1em;vertical-align:-0.25em;"></span><span class="base textstyle uncramped"><span class="mopen">(</span><span class="mord mathrm">1</span><span class="mpunct">,</span><span class="mord mathrm">1</span><span class="mclose">)</span></span></span></span></span> -&gt; <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mo>(</mo><mn>2</mn><mo separator="true">,</mo><mn>1</mn><mo>)</mo></mrow><annotation encoding="application/x-tex">(2,1)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.75em;"></span><span class="strut bottom" style="height:1em;vertical-align:-0.25em;"></span><span class="base textstyle uncramped"><span class="mopen">(</span><span class="mord mathrm">2</span><span class="mpunct">,</span><span class="mord mathrm">1</span><span class="mclose">)</span></span></span></span></span> -&gt; <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mo>(</mo><mn>2</mn><mo separator="true">,</mo><mn>2</mn><mo>)</mo></mrow><annotation encoding="application/x-tex">(2,2)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.75em;"></span><span class="strut bottom" style="height:1em;vertical-align:-0.25em;"></span><span class="base textstyle uncramped"><span class="mopen">(</span><span class="mord mathrm">2</span><span class="mpunct">,</span><span class="mord mathrm">2</span><span class="mclose">)</span></span></span></span></span>. Pikachu needs to have health of <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mn>1</mn></mrow><annotation encoding="application/x-tex">1</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.64444em;"></span><span class="strut bottom" style="height:0.64444em;vertical-align:0em;"></span><span class="base textstyle uncramped"><span class="mord mathrm">1</span></span></span></span></span> since there are no battles to be fought.</p></div></td></tr><tr><td><pre>3 3
0 1 2
-2 -9 -4
-8 5 0
</pre></td><td><pre>2</pre></td><td><div><p>Blue can take the path from <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mo>(</mo><mn>1</mn><mo separator="true">,</mo><mn>1</mn><mo>)</mo></mrow><annotation encoding="application/x-tex">(1,1)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.75em;"></span><span class="strut bottom" style="height:1em;vertical-align:-0.25em;"></span><span class="base textstyle uncramped"><span class="mopen">(</span><span class="mord mathrm">1</span><span class="mpunct">,</span><span class="mord mathrm">1</span><span class="mclose">)</span></span></span></span></span> -&gt; <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mo>(</mo><mn>1</mn><mo separator="true">,</mo><mn>2</mn><mo>)</mo></mrow><annotation encoding="application/x-tex">(1,2)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.75em;"></span><span class="strut bottom" style="height:1em;vertical-align:-0.25em;"></span><span class="base textstyle uncramped"><span class="mopen">(</span><span class="mord mathrm">1</span><span class="mpunct">,</span><span class="mord mathrm">2</span><span class="mclose">)</span></span></span></span></span> -&gt; <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mo>(</mo><mn>1</mn><mo separator="true">,</mo><mn>3</mn><mo>)</mo></mrow><annotation encoding="application/x-tex">(1,3)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.75em;"></span><span class="strut bottom" style="height:1em;vertical-align:-0.25em;"></span><span class="base textstyle uncramped"><span class="mopen">(</span><span class="mord mathrm">1</span><span class="mpunct">,</span><span class="mord mathrm">3</span><span class="mclose">)</span></span></span></span></span> -&gt; <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mo>(</mo><mn>2</mn><mo separator="true">,</mo><mn>3</mn><mo>)</mo></mrow><annotation encoding="application/x-tex">(2,3)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.75em;"></span><span class="strut bottom" style="height:1em;vertical-align:-0.25em;"></span><span class="base textstyle uncramped"><span class="mopen">(</span><span class="mord mathrm">2</span><span class="mpunct">,</span><span class="mord mathrm">3</span><span class="mclose">)</span></span></span></span></span> -&gt; <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mo>(</mo><mn>3</mn><mo separator="true">,</mo><mn>3</mn><mo>)</mo></mrow><annotation encoding="application/x-tex">(3,3)</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.75em;"></span><span class="strut bottom" style="height:1em;vertical-align:-0.25em;"></span><span class="base textstyle uncramped"><span class="mopen">(</span><span class="mord mathrm">3</span><span class="mpunct">,</span><span class="mord mathrm">3</span><span class="mclose">)</span></span></span></span></span>. Pikachu needs to have health of <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mn>2</mn></mrow><annotation encoding="application/x-tex">2</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.64444em;"></span><span class="strut bottom" style="height:0.64444em;vertical-align:0em;"></span><span class="base textstyle uncramped"><span class="mord mathrm">2</span></span></span></span></span> since there is <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mn>1</mn></mrow><annotation encoding="application/x-tex">1</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.64444em;"></span><span class="strut bottom" style="height:0.64444em;vertical-align:0em;"></span><span class="base textstyle uncramped"><span class="mord mathrm">1</span></span></span></span></span> battle to be fought and there are <span><span class="katex"><span class="katex-mathml"><math><semantics><mrow><mn>2</mn></mrow><annotation encoding="application/x-tex">2</annotation></semantics></math></span><span class="katex-html" aria-hidden="true"><span class="strut" style="height:0.64444em;"></span><span class="strut bottom" style="height:0.64444em;vertical-align:0em;"></span><span class="base textstyle uncramped"><span class="mord mathrm">2</span></span></span></span></span> potions in the path.</p></div></td></tr></tbody></table></p></div></div>