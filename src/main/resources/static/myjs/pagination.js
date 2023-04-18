const resultsPerPage = 5;

function createPagination() {
  const pagination = document.getElementById("pagination");
  pagination.innerHTML = "";

  const numPages = Math.ceil(results.length / resultsPerPage);

  for (let i = 1; i <= numPages; i++) {
    const li = document.createElement("li");
    const a = document.createElement("a");
    a.href = "#";
    a.textContent = i;
    li.appendChild(a);
    pagination.appendChild(li);
  }

  pagination.addEventListener("click", function(e) {
    e.preventDefault();

    if (e.target.nodeName === "A") {
      const page = parseInt(e.target.textContent);
      showResults(page);
      markActivePage(page);
    }
  });

  showResults(1);
  markActivePage(1);
}

function showResults(page) {
  const resultsDiv = document.getElementById("results-container");
  const start = (page - 1) * resultsPerPage;
  const end = start + resultsPerPage;
  const resultsToShow = results.slice(start, end);

  resultsDiv.innerHTML = "";

  for (let i = 0; i < resultsToShow.length; i++) {
    const p = document.createElement("p");
    p.textContent = resultsToShow[i];
    resultsDiv.appendChild(p);
  }
}

function markActivePage(page) {
  const paginationLinks = document.querySelectorAll(".pagination li a");

  for (let i = 0; i < paginationLinks.length; i++) {
    if (i === page - 1) {
      paginationLinks[i].parentNode.classList.add("active");
    } else {
      paginationLinks[i].parentNode.classList.remove("active");
    }
  }
}

createPagination();